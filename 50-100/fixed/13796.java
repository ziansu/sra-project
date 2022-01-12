private void detectMovement(float lastX, float lastY) {
    final float verticalMovement = java.lang.Math.abs((lastY - (this.y)));
    final float horizontalMovement = java.lang.Math.abs((lastX - (this.x)));
    startMuseumView(index);
}