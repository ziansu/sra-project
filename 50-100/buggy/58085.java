@java.lang.Override
public void setRealmObject(@android.support.annotation.NonNull
io.realm.DynamicRealmObject realmObject) {
    if (de.jonasrottmann.realmbrowser.helper.Utils.isBlob(getField())) {
        if ((realmObject.getBlob(getField().getName())) == null) {
            updateFieldIsNullCheckBoxValue(true);
        }else {
            textView.setText(de.jonasrottmann.realmbrowser.helper.Utils.createBlobValueString(realmObject.getBlob(getField().getName())));
        }
    }else {
        throw new java.lang.IllegalArgumentException();
    }
}