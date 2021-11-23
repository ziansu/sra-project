private void makeSound() {
    sp = new android.media.SoundPool(1, android.media.AudioManager.STREAM_ALARM, 0);
    SOUND_ID = sp.load(this, R.raw.bojangles, 20);
    sp.setOnLoadCompleteListener(new android.media.SoundPool.OnLoadCompleteListener() {
        @java.lang.Override
        public void onLoadComplete(android.media.SoundPool soundPool, int soundID, int status) {
            soundPool.play(soundID, 1, 1, 0, (-1), 1);
        }
    });
}