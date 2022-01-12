public void run() {
    try {
        java.lang.Thread.sleep(1000);
    } catch (java.lang.InterruptedException e) {
        e.printStackTrace();
    }
    context.startActivity(new android.content.Intent(context, com.github.sensation.sensationjukebox.MapsActivity.class));
    overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
    finish();
}