public static pe.util.math.Mat2f mul(pe.util.math.Mat2f mat, pe.util.math.Vec2f vec) {
    return new pe.util.math.Mat2f(((mat.s00) * (vec.x)), ((mat.s01) * (vec.y)), ((mat.s10) * (vec.x)), ((mat.s11) * (vec.y)));
}