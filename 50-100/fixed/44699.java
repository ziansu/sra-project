@java.lang.Override
public void run() {
    com.tidevalet.thread.adapter dbAdapter = new com.tidevalet.thread.adapter(context);
    android.util.Log.d(TAG, "We are here");
    try {
        dbAdapter.open();
        org.xmlrpc.android.WebUtils.callWp("wp.getTerms", context);
        dbAdapter.close();
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
}