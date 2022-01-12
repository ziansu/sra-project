private void shareSingle(com.mauriciotogneri.fileexplorer.models.FileInfo fileInfo) {
    try {
        android.content.Intent intent = new android.content.Intent(android.content.Intent.ACTION_SEND);
        intent.setType(fileInfo.mimeType());
        intent.putExtra(Intent.EXTRA_STREAM, fileInfo.uri());
        startActivity(android.content.Intent.createChooser(intent, getString(R.string.shareFile_title)));
    } catch (java.lang.Exception e) {
        showMessage(R.string.shareFile_unable);
    }
}