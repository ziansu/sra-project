@java.lang.Override
public void onBufferingUpdate(io.vov.vitamio.MediaPlayer mp, int percent) {
    if (percent == 100) {
        hideLoading();
        mp.start();
    }else {
        showLoading();
        tvCache.setText((("缓冲: " + percent) + "%"));
        if (mp.isPlaying()) {
            mp.pause();
        }
    }
}