@java.lang.Override
public void onBindView() {
    findViewById(R.id.fragment_setting_bt_save);
    fragment_setting_et_water = ((android.widget.EditText) (findViewById(R.id.fragment_setting_et_water)));
    fragment_setting_et_electric = ((android.widget.EditText) (findViewById(R.id.fragment_setting_et_electric)));
    fragment_setting_et_device = ((android.widget.EditText) (findViewById(R.id.fragment_setting_et_device)));
    fragment_setting_sn_owner = ((android.widget.Spinner) (findViewById(R.id.fragment_setting_sn_owner)));
    findViewById(R.id.fragment_setting_bt_add_owner);
}