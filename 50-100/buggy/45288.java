private void updateShuffleButton() {
    boolean shuffle = org.oucho.musicplayer.PlayerService.isShuffleEnabled();
    android.util.Log.d("shuffle", ("shuffle " + (java.lang.String.valueOf(shuffle))));
    android.widget.ImageView shuffleButton = ((android.widget.ImageView) (findViewById(R.id.shuffle)));
    if (shuffle) {
        assert shuffleButton != null;
        shuffleButton.setImageResource(R.drawable.ic_shuffle_grey_600_24dp);
    }else {
        assert shuffleButton != null;
        shuffleButton.setImageResource(R.drawable.ic_shuffle_grey_400_24dp);
    }
}