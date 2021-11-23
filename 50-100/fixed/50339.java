public void onClickCancle(android.view.View v) {
    if ((v.getId()) == (R.id.upload_cancle_button)) {
        final android.content.Intent intent = new android.content.Intent(this, io.github.data4all.service.UploadService.class);
        intent.putExtra(UploadService.ACTION, UploadService.CANCLE);
        intent.putExtra(UploadService.HANDLER, new io.github.data4all.activity.UploadActivity.MyReceiver());
        startService(intent);
        showProgress(false);
    }
}