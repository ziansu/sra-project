public void doAll() {
    if ((PreferenceList.EnableYandex) == true)
        doInBackground();
    else {
        available.acquireUninterruptibly();
        long time = java.lang.System.currentTimeMillis();
        if (time > (akhil.alltrans.GetTranslateToken.lastExpireTime)) {
            android.util.Log.i("AllTrans", ((("AllTrans: In Thread " + (java.lang.Thread.currentThread().getId())) + "  Entering get new token for string : ") + (getTranslate.stringToBeTrans)));
            getNewToken();
        }else {
            available.release();
            doInBackground();
        }
    }
}