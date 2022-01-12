public engine.math.Vector3 getAimDirection() {
    return target.Clone().subtract(position);
}