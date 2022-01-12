@java.lang.Override
protected void onPostExecute(java.lang.String result) {
    if (result != null) {
        android.util.Log.e(com.cocosoft.ecart.loginmodule.LoginActivity.TAG, ("==" + result));
        try {
            if ((firstFragment) != null)
                ((com.cocosoft.ecart.loginmodule.HomeFragment) (firstFragment)).openScanListFrag(new org.json.JSONObject(result), 1);
            
        } catch (org.json.JSONException e) {
            e.printStackTrace();
        }
    }
}