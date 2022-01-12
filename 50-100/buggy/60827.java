@java.lang.Override
public void run() {
    if ((mGreenSeekBar) != null) {
        mGreenSeekBar.setProgress((greenValue & 255));
        if (colorDemo) {
            greenFlag = true;
        }else
            if (!(mGreenSeekBar.isEnabled())) {
                mGreenSeekBar.setEnabled(true);
            }
        
    }
}