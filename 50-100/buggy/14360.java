@java.lang.Override
public void onWifiListLoaded(java.util.ArrayList<com.gmail.ndraiman.wifipasswords.pojo.WifiEntry> listWifi) {
    if ((mProgressBar.getVisibility()) == (android.view.View.VISIBLE)) {
        mProgressBar.setVisibility(View.GONE);
    }
    android.util.Log.d(com.gmail.ndraiman.wifipasswords.fragments.MainWifiFragment.TAG, "onWifiListLoaded");
    mListWifi = new java.util.ArrayList(listWifi);
    mAdapter.setWifiList(listWifi);
}