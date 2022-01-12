@butterknife.OnClick(value = R.id.icon)
void version() {
    android.widget.Toast.makeText(this, ((((((getString(R.string.version)) + (cc.haoduoyu.umaru.BuildConfig.VERSION_NAME)) + "\n\n") + (cc.haoduoyu.umaru.utils.PreferencesUtils.getAll(this))) + "\n\n") + (cc.haoduoyu.umaru.utils.SettingUtils.getAll())), Toast.LENGTH_LONG).show();
    com.apkfuns.logutils.LogUtils.d(cc.haoduoyu.umaru.utils.PreferencesUtils.getAll(this));
    com.apkfuns.logutils.LogUtils.d(cc.haoduoyu.umaru.utils.SettingUtils.getAll());
}