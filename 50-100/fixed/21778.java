private void makeSound() {
    sp.setOnLoadCompleteListener(new android.media.SoundPool.OnLoadCompleteListener() {
        @java.lang.Override
        public void onLoadComplete(android.media.SoundPool soundPool, int soundID, int status) {
            soundPool.play(soundID, 1, 1, 0, (-1), 1);
        }
    });
}