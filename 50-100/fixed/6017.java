private void configureMediaPlayerSignalSound() {
    if ((Build.VERSION.SDK_INT) >= (Build.VERSION_CODES.LOLLIPOP))
        com.hoymm.root.morsecodeconverter._5_FooterPanel.SoundButton.beepSound = new android.media.SoundPool.Builder().setMaxStreams(1).build();
    else
        com.hoymm.root.morsecodeconverter._5_FooterPanel.SoundButton.beepSound = new android.media.SoundPool(1, android.media.AudioManager.STREAM_MUSIC, 1);
    
    com.hoymm.root.morsecodeconverter._5_FooterPanel.SoundButton.mSoundId = com.hoymm.root.morsecodeconverter._5_FooterPanel.SoundButton.beepSound.load(getActivity(), R.raw.beep, 1);
}