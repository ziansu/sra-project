public src.gamrcorps.convex.Quaternion divide(src.gamrcorps.convex.Quaternion q) {
    return multiply(src.gamrcorps.convex.Quaternion.conjugate(q)).divide(q.norm());
}