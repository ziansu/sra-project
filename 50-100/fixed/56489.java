private void launchPlayMenuActivity(java.lang.String romPath, java.lang.String md5) {
    if ((!(android.text.TextUtils.isEmpty(romPath))) && (!(android.text.TextUtils.isEmpty(md5)))) {
        android.content.Intent intent = new android.content.Intent(this, paulscode.android.mupen64plusae.PlayMenuActivity.class);
        intent.putExtra(Keys.Extras.ROM_PATH, romPath);
        intent.putExtra(Keys.Extras.ROM_MD5, md5);
        startActivity(intent);
    }
}