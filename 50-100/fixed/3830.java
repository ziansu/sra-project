public void toggleBrightness() {
    if ((android.os.Build.VERSION.SDK_INT) >= (android.os.Build.VERSION_CODES.M)) {
        if (Settings.System.canWrite(this)) {
            realToggleBrightness();
        }else {
            android.content.Intent writeSettingsIntent = new android.content.Intent(this, com.zoromatic.widgets.WriteSettingsActivity.class);
            writeSettingsIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            startActivity(writeSettingsIntent);
        }
    }else {
        realToggleBrightness();
    }
}