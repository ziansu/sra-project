private void recordAudio() {
    synchronized(this) {
        android.content.SharedPreferences sharedPref = getApplicationContext().getSharedPreferences(Common.EL_PREFS, 0);
        boolean isCollecting = sharedPref.getBoolean("isCollecting", false);
        if (isCollecting) {
            audio = new com.iiitd.muc.energylens.AudioData();
            audio.start();
        }else {
            audio.stopReader();
            stopSelf();
        }
    }
}