@java.lang.Override
public void onScanCompleted(java.lang.String path, android.net.Uri uri) {
    try {
        if (uri != null) {
            android.content.Intent intent = new android.content.Intent();
            intent.setAction(Intent.ACTION_VIEW);
            intent.setDataAndType(uri, "image/jpeg");
            startActivity(intent);
        }
    } finally {
        conn.disconnect();
        conn = null;
    }
}