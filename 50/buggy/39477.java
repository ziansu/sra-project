public void increment(int increment) {
    this.orientation = ((this.orientation) + increment) % 360;
    if ((this.orientation) < 0)
        this.orientation = 360 - (this.orientation);
    
}