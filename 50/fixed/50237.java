@java.lang.Override
public void onClick(android.view.View view) {
    if (moviePlayer.isPlaying()) {
        moviePlayer.pause();
    }else {
        moviePlayer.play();
    }
}