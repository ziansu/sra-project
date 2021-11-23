@java.lang.Override
public void onProgressChanged(android.widget.SeekBar seekBar, int progress, boolean fromUser) {
    if (fromUser) {
        SteeringAngleRequest = ((((float) (progress)) / 1000) * ((MAXSTEERINGANGLE) - (MINSTEERINGANGLE))) + (MINSTEERINGANGLE);
        sendUpdate();
        UpdateUI();
    }
}