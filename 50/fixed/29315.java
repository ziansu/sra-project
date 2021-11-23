@java.lang.Override
protected void onStop() {
    weather.stop();
    info.stop();
    body.stop();
    commute.stop();
    super.onStop();
}