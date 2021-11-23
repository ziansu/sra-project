@java.lang.Override
protected void onStart() {
    super.onStart();
    weather.start();
    info.start();
    body.start();
    commute.start();
}