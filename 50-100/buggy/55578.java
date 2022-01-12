public boolean collideFromLeft(edu.virginia.engine.display.DisplayObject other) {
    if (collidesWith(other)) {
        java.awt.Rectangle myRectangle = this.getHitbox();
        java.awt.Rectangle otherRectangle = other.getHitbox();
        return ((myRectangle.x) + (myRectangle.getWidth())) > (otherRectangle.x);
    }else {
        return false;
    }
}