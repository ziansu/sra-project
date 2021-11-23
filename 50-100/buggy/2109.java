public void run() {
    try {
        java.lang.Thread.sleep(5000);
    } catch (java.lang.Exception e) {
    } finally {
        android.content.Intent intent = new android.content.Intent(this, com.lazybums.snackup.LandingActivity.class);
        intent.putExtra("latitude", latitude);
        intent.putExtra("longitude", longitude);
        startActivity(intent);
        finish();
    }
}