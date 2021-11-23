private void checkSystemMode() {
    android.content.SharedPreferences sp = getSharedPreferences(Def.SHARE_PREFERENCE, Context.MODE_PRIVATE);
    java.lang.String system_mode = sp.getString(Def.SP_SYSTEM_MODE, Def.RECORDING_MODE);
    if (!(android.text.TextUtils.equals(system_mode, Def.RECORDING_MODE))) {
        mMenuLoadingIndicator.setVisibility(View.VISIBLE);
        android.content.Intent intent = new android.content.Intent(getApplicationContext(), com.liteon.iview.service.DvrInfoService.class);
        intent.setAction(Def.ACTION_SET_SYS_MODE);
        intent.putExtra(Def.EXTRA_SET_SYS_MODE, Def.RECORDING_MODE);
        startService(intent);
    }
}