public java.awt.Rectangle getBoundsBottom() {
    return new java.awt.Rectangle(((this.x) + (this.boundsOffset)), (((this.y) + (this.height)) - (this.boundsWidth)), ((this.width) - (2 * (this.boundsOffset))), this.boundsWidth);
}