public org.json.JSONObject getCheckinInfo(android.app.Activity act) {
    org.json.JSONObject json = null;
    com.fly.firefly.base.BaseFragment.prefManager = new com.fly.firefly.utils.SharedPrefManager(act);
    java.util.HashMap<java.lang.String, java.lang.String> init = com.fly.firefly.base.BaseFragment.prefManager.getCheckinInfo();
    java.lang.String checkinInfo = init.get(SharedPrefManager.CHECKIN_INFO);
    try {
        json = new org.json.JSONObject(checkinInfo);
    } catch (org.json.JSONException e) {
        e.printStackTrace();
    }
    return json;
}