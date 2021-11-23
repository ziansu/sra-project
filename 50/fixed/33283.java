public void setShadowRadius(float radius) {
    if (radius < 0) {
        throw new java.lang.IllegalArgumentException("Shadow radius cannot be less than zero.");
    }
    if (radius != (mShadowRadius)) {
        setShadowInternal(radius, mShadowColor, true);
    }
}