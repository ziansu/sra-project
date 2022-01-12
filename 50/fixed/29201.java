public void ProfileSetting() {
    if (!(getClass().equals(gopackdev.arrivalpack.ProfileSettingActivity.class))) {
        android.content.Intent myIntent = new android.content.Intent(this, gopackdev.arrivalpack.ProfileSettingActivity.class);
        startActivity(myIntent);
    }
}