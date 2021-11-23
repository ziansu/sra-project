@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_settings);
    lv_setting = ((android.widget.ListView) (findViewById(R.id.lv_setting)));
    settingAdapter = new com.pwdemo.phone.adapter.SettingAdapter(this);
    settingAdapter.setCallback(this);
    lv_setting.setAdapter(settingAdapter);
    isRoot();
}