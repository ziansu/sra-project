private boolean isIntersecting(summerrpg.Instance instance) {
    return ((2 * (java.lang.Math.abs(((instance.getX()) - (x))))) < ((width) + (instance.getWidth()))) && ((2 * (java.lang.Math.abs(((instance.getY()) - (y))))) < ((height) + (instance.getHeight())));
}