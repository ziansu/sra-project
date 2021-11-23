@java.lang.Override
public void run() {
    com.tidevalet.thread.adapter dbAdapter = new com.tidevalet.thread.adapter(context);
    dbAdapter.open();
    android.util.Log.d(TAG, "We are here");
    try {
        org.xmlrpc.android.WebUtils.callWp("wp.getTerms", context);
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
    dbAdapter.close();
}