public com.badlogic.gdx.graphics.Color getSuitSwipeColor() {
    float angle;
    if ((vertSwipeDistance) > (swipeDistance)) {
        angle = 1 / (50 / (vertSwipeDistance));
        swipeColor = new com.badlogic.gdx.graphics.Color(1, 0, 0, java.lang.Math.abs(angle));
    }
}