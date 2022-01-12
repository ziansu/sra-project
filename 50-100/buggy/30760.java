private void manageSwitchButton() {
    final android.widget.RelativeLayout localBackupLayout = ((android.widget.RelativeLayout) (findViewById(R.id.relativelayout_settings_backup_localbackupONlayout)));
    android.widget.Switch localBackupSwitch = ((android.widget.Switch) (findViewById(R.id.switch_settings_backup_localswitchbackup)));
    localBackupSwitch.setOnCheckedChangeListener(new android.widget.CompoundButton.OnCheckedChangeListener() {
        public void onCheckedChanged(android.widget.CompoundButton buttonView, boolean isChecked) {
            if (isChecked) {
                localBackupLayout.setVisibility(View.VISIBLE);
                fernandoperez.lifemanager.activities.BackUpActivity.isLocalBackupON = true;
            }else {
                localBackupLayout.setVisibility(View.GONE);
                fernandoperez.lifemanager.activities.BackUpActivity.isLocalBackupON = false;
            }
        }
    });
}