private boolean isIntersecting(summerrpg.Instance instance) {
    return ((2 * ((instance.getX()) - (x))) < ((width) + (instance.getWidth()))) && ((2 * ((instance.getY()) - (y))) < ((height) + (instance.getHeight())));
}