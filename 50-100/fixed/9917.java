protected void onPostExecute(java.lang.Boolean result) {
    loadingDialog.cancel();
    if (result) {
        android.content.Intent intent = new android.content.Intent(android.content.Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_STREAM, android.net.Uri.fromFile(targetFile));
        startActivity(intent);
    }
}