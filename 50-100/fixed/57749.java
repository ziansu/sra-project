@java.lang.Override
public void onReceive(android.content.Context context, android.content.Intent intent) {
    if (AudioManager.ACTION_AUDIO_BECOMING_NOISY.equals(intent.getAction())) {
        mbAudioConnected = false;
        if ((mMTSCRA.getDeviceType()) == (com.magtek.mobile.android.scra.MagTekSCRA.DEVICE_TYPE_AUDIO)) {
            if (mMTSCRA.isDeviceConnected()) {
                closeDevice();
            }
        }
    }
}