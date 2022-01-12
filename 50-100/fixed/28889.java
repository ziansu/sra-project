private void playClickSound() {
    mediaPlayer = android.media.MediaPlayer.create(getActivity(), R.raw.button_click);
    mediaPlayer.start();
    mediaPlayer.setOnCompletionListener(new android.media.MediaPlayer.OnCompletionListener() {
        @java.lang.Override
        public void onCompletion(android.media.MediaPlayer mp) {
            mp.release();
        }
    });
}