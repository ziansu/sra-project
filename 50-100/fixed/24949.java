private void initData() {
    if (org.cocos2dx.lib.Cocos2dxHelper.getDeviceModel().contains("GT-I9100")) {
        this.mSoundPool = new android.media.SoundPool(org.cocos2dx.lib.Cocos2dxSound.MAX_SIMULTANEOUS_STREAMS_I9100, android.media.AudioManager.STREAM_MUSIC, org.cocos2dx.lib.Cocos2dxSound.SOUND_QUALITY);
    }else {
        this.mSoundPool = new android.media.SoundPool(org.cocos2dx.lib.Cocos2dxSound.MAX_SIMULTANEOUS_STREAMS_DEFAULT, android.media.AudioManager.STREAM_MUSIC, org.cocos2dx.lib.Cocos2dxSound.SOUND_QUALITY);
    }
    this.mSoundPool.setOnLoadCompleteListener(new org.cocos2dx.lib.Cocos2dxSound.OnLoadCompletedListener());
    this.mLeftVolume = 0.5F;
    this.mRightVolume = 0.5F;
}