public void rest() {
    this.setActivity(Activity.RESTING);
    if (this.isResting())
        java.lang.System.out.println("resting");
    
    this.canStopResting = false;
}