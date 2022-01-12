@java.lang.Override
protected void onPostExecute(java.lang.Boolean aBoolean) {
    super.onPostExecute(aBoolean);
    if (!aBoolean) {
        com.byteshaft.towerinfo.PhoneInfo.getInstance().setDataDirection(0);
    }else {
        if (AppGlobals.APP_FOREGROUND) {
            android.util.Log.e("TAG", ("wifiAction" + (AppGlobals.APP_FOREGROUND)));
            com.byteshaft.towerinfo.PhoneInfo.getInstance().connectionState_info.setText("Connected");
        }
    }
}