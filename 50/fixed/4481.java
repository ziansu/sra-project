public void draw(float[] initialMatrix) {
    plane.draw(initialMatrix);
    if ((flight) != null) {
        flight.draw(initialMatrix);
    }
}