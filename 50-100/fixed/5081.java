public void run() {
    getDatafromAPI();
    try {
        java.lang.Thread.sleep(0);
    } catch (java.lang.InterruptedException e) {
        e.printStackTrace();
    } finally {
        android.content.Intent intent = new android.content.Intent(this, com.example.sufian.livelocal.MainActivity.class);
        startActivity(intent);
    }
}