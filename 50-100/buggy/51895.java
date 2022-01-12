public void run() {
    try {
        java.lang.Thread.sleep(1500);
    } catch (java.lang.InterruptedException e) {
        e.printStackTrace();
    } finally {
        android.content.Intent startMain = new android.content.Intent(this, lab.chabingba.telerikacademyschedule.MainActivity.class);
        startActivity(startMain);
        finish();
    }
}