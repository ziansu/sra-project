public jme3utilities.math.VectorXZ subtract(jme3utilities.math.VectorXZ decrement) {
    float newX = (x) - (decrement.getX());
    float newZ = (z) - (decrement.getZ());
    jme3utilities.math.VectorXZ result = new jme3utilities.math.VectorXZ(newX, newZ);
    return result;
}