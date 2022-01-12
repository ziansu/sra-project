public boolean isVisible() {
    if ((this.getRelativeAngle()) > (c.getFOV()))
        return false;
    
    return true;
}