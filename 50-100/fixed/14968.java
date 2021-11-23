@java.lang.Override
public void onClick(android.view.View v) {
    android.util.Log.w("sound layout", ((soundOn) + ""));
    if (soundOn) {
        soundButton.setImageResource(R.drawable.ic_sound_off_img);
        isSoundOn = false;
    }else {
        soundButton.setImageResource(R.drawable.ic_sound_img);
        isSoundOn = true;
    }
    soundOn = !(soundOn);
}