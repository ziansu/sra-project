public void setSongPosition(int changed) {
    if ((this.clip) != null) {
        this.clip.stop();
        this.clip.setFramePosition(((this.clip.getFramePosition()) - changed));
        this.clip.start();
    }
}