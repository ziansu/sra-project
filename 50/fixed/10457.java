@java.lang.Override
public void onConfigurationChanged(android.content.res.Configuration newConfig) {
    super.onConfigurationChanged(newConfig);
    new net.mpross.pws.MainActivity.datagrab().execute("");
}