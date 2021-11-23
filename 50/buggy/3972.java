@java.lang.Override
protected void onResume() {
    super.onResume();
    lock = false;
    login_video.start();
}