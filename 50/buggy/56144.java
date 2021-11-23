@java.lang.Override
protected void onPause() {
    super.onPause();
    com.z299studio.pb.Application.getInstance().onPause();
}