private float lerp(float v0, float v1, float t) {
    return t == 1 ? ((1 - t) * v0) + (t * v1) : v0 + (t * (v1 - v0));
}