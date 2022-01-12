@java.lang.Override
public android.support.v4.content.Loader<android.database.Cursor> onCreateLoader(int i, android.os.Bundle bundle) {
    android.support.v4.content.CursorLoader cursor;
    java.lang.String sortOrder = (LearnChineseContract.CustomLearning.COLUMN_NAME) + " ASC";
    android.net.Uri uri = LearnChineseContract.Character.buildCharacterUriByRead(LearnChineseContract.YES);
    cursor = new android.support.v4.content.CursorLoader(getActivity(), uri, null, null, null, sortOrder);
    return cursor;
}