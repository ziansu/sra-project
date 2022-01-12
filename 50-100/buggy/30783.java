@java.lang.Override
public void onScanCompleted(java.lang.String s, android.net.Uri uri) {
    if (!(found_id_album)) {
        id = com.horaapps.leafpic.Data.Providers.MediaStoreProvider.getAlbumId(context, s);
        found_id_album = true;
    }
    android.util.Log.d(s, ("onScanCompleted: " + s));
    m.setPath(s);
    m.setUri(uri);
}