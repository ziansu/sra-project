@java.lang.Override
public void run() {
    if ((mGreenSeekBar) != null) {
        mGreenSeekBar.setProgress((greenValue & 255));
        greenFlag = true;
        if ((!(colorDemo)) && (!(mGreenSeekBar.isEnabled()))) {
            mGreenSeekBar.setEnabled(true);
        }
    }
}