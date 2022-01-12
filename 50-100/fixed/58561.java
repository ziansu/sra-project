@java.lang.Override
public void onScanCompleted(java.lang.String s, android.net.Uri uri) {
    if (uri != null) {
        context.getContentResolver().delete(uri, null, null);
    }
    java.lang.System.out.println(("file deleted: " + path));
    android.util.Log.i("ExternalStorage", (("Scanned " + s) + ":"));
    android.util.Log.i("ExternalStorage", ("-> uri=" + uri));
}