private void launchMain() {
    shutdown();
    android.content.Intent intent = new android.content.Intent(getApplicationContext(), com.mad.utsstudcentre.Controller.MainActivity.class);
    startActivity(intent);
    finish();
}