public pe.util.math.Mat3f scale(pe.util.math.Vec2f delta) {
    pe.util.math.Mat3f scale = new pe.util.math.Mat3f();
    scale.s00 = delta.x;
    scale.s11 = delta.y;
    return pe.util.math.Mat3f.mul(this, scale);
}