private boolean isClickInExpandedBoundaries(float x, float y) {
    boolean isInBoundsX = (x > (this.x)) && (x < ((this.x) + (this.width)));
    boolean isInBoundsY = (y > (this.y)) && (y < ((this.y) + (this.expandedHeight)));
    return isInBoundsX && isInBoundsY;
}