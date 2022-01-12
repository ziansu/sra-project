public boolean collideFromBottom(edu.virginia.engine.display.DisplayObject other) {
    if (collidesWith(other)) {
        java.awt.Rectangle myRectangle = this.getHitbox();
        java.awt.Rectangle otherRectangle = other.getHitbox();
        return (myRectangle.y) < ((otherRectangle.y) + (otherRectangle.getHeight()));
    }else {
        return false;
    }
}