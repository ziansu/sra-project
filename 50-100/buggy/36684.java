@java.lang.Override
public void onProgressChanged(android.webkit.WebView view, int newProgress) {
    android.os.Message msg = new android.os.Message();
    msg.what = com.five.magic.MainActivity.UPDATE_PROGRESS;
    msg.obj = newProgress;
    mHandler.sendMessage(msg);
    if (newProgress == 100) {
        mPageLoaded = true;
        android.util.Log.e("CQW", ("Net page loading done : " + newProgress));
    }else {
        mPageLoaded = false;
    }
}