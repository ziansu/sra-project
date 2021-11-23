public void selectClicked() {
    abDiscardView.setEnabled(false);
    abDoneView.setEnabled(false);
    progress.show();
    if (fileNames.isEmpty()) {
        setResult(com.synconset.RESULT_CANCELED);
        progress.dismiss();
        finish();
    }else {
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_NOSENSOR);
        new com.synconset.MultiImageChooserActivity.ResizeImagesTask().execute(fileNames.entrySet());
    }
}