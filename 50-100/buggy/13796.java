private void detectMovement(float lastX, float lastY) {
    final float verticalMovement = java.lang.Math.abs((lastY - (this.y)));
    final float horizontalMovement = java.lang.Math.abs((lastX - (this.x)));
    if (((lastX - (this.x)) <= 0) && (horizontalMovement > 75)) {
        startMuseumView(index);
    }
}