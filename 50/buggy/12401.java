@java.lang.Override
public void onPrepare() {
    com.kercer.kercore.debug.KCLog.d("onPrepare:%s", aUrl);
    new java.io.File(path).delete();
}