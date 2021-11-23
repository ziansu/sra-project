@java.lang.Override
public void onClick(android.view.View v) {
    if ((v.getId()) == (R.id.vcv_img_play)) {
        if (isPlaying()) {
            pause();
        }else {
            start();
        }
    }else {
        fullscreen();
    }
}