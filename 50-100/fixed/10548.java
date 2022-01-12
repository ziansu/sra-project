@java.lang.Override
public void run() {
    if ((getAudioService()) != null) {
        setMilliseconds((((drawSurfaceWidth / ((float) (getAudioService().getSampleRate()))) * 1000) / 2));
    }
    setMillivolts(((((((float) (drawSurfaceHeight)) / 4.0F) / 24.5F) / 1000) * (com.backyardbrains.utils.BYBConstants.millivoltScale)));
}