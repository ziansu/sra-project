@java.lang.Override
public void onProgressChanged(android.widget.SeekBar seekBar, int progress, boolean fromUser) {
    if ((progress > 0) && (progress <= (screenCount))) {
        saveSurvey();
        mCurrentScreen = getScreen(progress);
        setupScreen();
    }
}