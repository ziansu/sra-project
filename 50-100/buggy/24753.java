public void downloadImage(android.view.View view) {
    java.lang.String strUrl = etUrl.getText().toString().trim();
    if (android.text.TextUtils.isEmpty(strUrl)) {
        showErrorDialog("Empty Url");
    }else {
        startService(com.cnkaptan.idtmessagingtest.DownloadImageService.newInstance(this, SAMPLE_URL));
    }
}