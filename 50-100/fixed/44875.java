@java.lang.Override
public void run() {
    try {
        synchronized(this) {
            wait(_splashTime);
        }
        finish();
        android.content.Intent i = new android.content.Intent();
        i.setClass(this, vn.mbm.phimp.me.PhimpMe.class);
        startActivity(i);
    } catch (java.lang.InterruptedException e) {
    }
}