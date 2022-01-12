@java.lang.Override
public void onClick(android.view.View v) {
    android.content.ContentResolver mResolver = getActivity().getContentResolver();
    android.net.Uri uri = saveToSQLite(mResolver, mMigraineRecordObject);
    if (uri != null) {
        if (endDataComplete) {
            updateMigraineRecordObject();
            com.terminatingcode.android.migrainetree.amazonaws.nosql.DynamoDBUtils.persistToAWS(mMigraineRecordObject, getActivity());
        }else {
            displayNotification(uri);
            onPartialRecordConfirmed(mMigraineRecordObject);
        }
    }
}