public void setSongPosition(int position) {
    if ((this.clip) != null) {
        this.clip.stop();
        java.lang.System.out.println(this.clip.getFramePosition());
        this.clip.setFramePosition(position);
        java.lang.System.out.println(this.clip.getFramePosition());
        this.clip.start();
    }
}