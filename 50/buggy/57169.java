@java.lang.Override
protected void onDestroy() {
    super.onDestroy();
    if ((preview) != null) {
        preview.setPreviewCallback(null);
        preview.close();
        preview = null;
    }
}