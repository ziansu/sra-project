public void onClickUpload(android.view.View v) {
    if ((v.getId()) == (R.id.upload_upload_button)) {
        showProgress(true);
        final android.content.Intent intent = new android.content.Intent(this, io.github.data4all.service.UploadService.class);
        intent.putExtra(UploadService.ACTION, UploadService.UPLOAD);
        intent.putExtra(UploadService.HANDLER, new io.github.data4all.activity.UploadActivity.MyReceiver());
        startService(intent);
        v.setVisibility(View.GONE);
        this.cancleButton.setVisibility(View.VISIBLE);
    }
}