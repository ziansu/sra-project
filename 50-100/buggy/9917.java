protected void onPostExecute(java.lang.Void result) {
    loadingDialog.cancel();
    android.content.Intent intent = new android.content.Intent(android.content.Intent.ACTION_SEND);
    intent.setType("text/plain");
    intent.putExtra(Intent.EXTRA_STREAM, android.net.Uri.fromFile(targetFile));
    startActivity(intent);
}