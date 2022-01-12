public void setUserVolume(int volume) {
    double dVolume = (((double) (volume)) / 100) * (maxVolume);
    android.util.Log.d("DEBUG", ("Volume level: " + (java.lang.String.valueOf(dVolume))));
    mAudioManager.setStreamVolume(AudioManager.STREAM_ALARM, (dVolume >= 1.0 ? ((int) (dVolume)) : 1), 0);
}