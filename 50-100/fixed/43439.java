public boolean collideFromRight(edu.virginia.engine.display.DisplayObject other) {
    if (collidesWith(other)) {
        java.awt.Rectangle myRectangle = this.getHitbox();
        java.awt.Rectangle otherRectangle = other.getHitbox();
        return (((otherRectangle.x) + (otherRectangle.getWidth())) > (myRectangle.x)) && ((myRectangle.x) > (otherRectangle.x));
    }else {
        return false;
    }
}