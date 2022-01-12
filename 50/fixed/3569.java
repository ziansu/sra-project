public final void decrementRotation() {
    (this.orientation)--;
    if ((this.orientation) < 0)
        this.orientation = (this.layout.size()) - 1;
    
}