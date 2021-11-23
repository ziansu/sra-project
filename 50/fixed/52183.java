public void rest() {
    this.setActivity(Activity.RESTING);
    if (this.isResting())
        this.canStopResting = false;
    
}