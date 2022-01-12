@java.lang.Override
public kaba.yucata.envoy.StateInfo loadInBackground() {
    final java.lang.String username = bundle.getString(kaba.yucata.envoy.datalink.LoaderHelper.USERNAME_KEY);
    if ((username == null) || (android.text.TextUtils.isEmpty(username)))
        return null;
    
    kaba.yucata.envoy.StateInfo info;
    try {
        return loadCurrentState(username);
    } catch (java.lang.Exception e) {
        e.printStackTrace();
        return new kaba.yucata.envoy.StateInfo(e.getMessage());
    }
}