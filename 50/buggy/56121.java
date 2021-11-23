@java.lang.Override
protected void onStart() {
    super.onStart();
    setBottleImage(this);
    new com.example.jack.thousandorigamicranes.notification.Alarm(getApplicationContext()).start();
    hideActionBar();
}