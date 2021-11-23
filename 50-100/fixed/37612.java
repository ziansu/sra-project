@java.lang.Override
public com.pushtorefresh.storio.contentprovider.operation.put.PutResult performPut(@android.support.annotation.NonNull
com.pushtorefresh.storio.contentprovider.StorIOContentProvider storIOContentProvider, @android.support.annotation.NonNull
android.content.ContentValues contentValues) {
    final android.net.Uri uri = getUri(contentValues);
    final java.lang.String idColumnName = getIdColumnName();
    final java.lang.Object idObject = contentValues.get(idColumnName);
    final java.lang.String idAsString = (idObject != null) ? idObject.toString() : null;
    return idAsString == null ? insert(storIOContentProvider, contentValues, uri) : updateOrInsert(storIOContentProvider, contentValues, uri, idColumnName, idAsString);
}