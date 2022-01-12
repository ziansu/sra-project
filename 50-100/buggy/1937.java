public void run() {
    while (active) {
        if (isPlaying()) {
            try {
                int currentTime = ((int) (mediaPlayerComponent.getMediaPlayer().getTime()));
                this.firePropertyChange(IMedia.PROP_TIME, previousTime, currentTime);
            } catch (java.lang.Exception ex) {
            }
        }
        try {
            java.lang.Thread.sleep(synergyviewcore.media.model.VLCMedia.OFFSET);
        } catch (java.lang.InterruptedException e) {
            e.printStackTrace();
        }
    } 
}