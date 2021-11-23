public void exoPlayerPlay() {
    if ((isPlaying()) == false) {
        play();
    }else {
        android.widget.Toast.makeText(mContext, "You are already play", Toast.LENGTH_SHORT).show();
    }
}