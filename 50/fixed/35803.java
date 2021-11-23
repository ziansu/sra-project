public void onDestroy() {
    db.close();
    super.onDestroy();
    mOpenCvCameraView.disableView();
}