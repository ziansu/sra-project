@java.lang.Override
protected void onStart() {
    super.onStart();
    weather.start();
    news.start();
    body.start();
    commute.start();
}