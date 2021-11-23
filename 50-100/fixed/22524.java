public void run() {
    try {
        new com.facwork.bonbin.SplashActivity.AsyncGetDataFromWeb().execute();
        int waited = 0;
        while ((_active) && (waited < (_splashTime))) {
            java.lang.Thread.sleep(100);
            if (_active) {
                waited += 100;
            }
        } 
    } catch (java.lang.InterruptedException e) {
    } finally {
        finish();
        android.content.Intent newIntent = new android.content.Intent(this, com.facwork.bonbin.SearchActivity.class);
        startActivityForResult(newIntent, 0);
    }
}