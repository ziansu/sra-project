public void translate(com.badlogic.gdx.math.Vector3 offset) {
    coordinates.add(offset);
    globalCoordinates.add(offset);
    calculateGlobalCoordinates();
}