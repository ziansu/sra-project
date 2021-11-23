public engine.math.Vector3 getAimDirection(engine.math.Vector3 target) {
    return engine.math.Vector3.subtract(target, position);
}