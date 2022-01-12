@java.lang.Override
public void onSpeedChanged(nuclei.media.MediaInterface mediaInterface, float s) {
    if ((speed) != null)
        speed.setText(nuclei.media.ResourceProvider.getInstance().getSelectedSpeed());
    
}