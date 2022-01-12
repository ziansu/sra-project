public boolean inFrustum(float x1, float y1, float z1, float x2, float y2, float z2) {
    boolean r;
    int i = 5;
    do {
        r = dot(c[i], x1, y1, z1, x2, y2, z2);
    } while (r && ((i--) > 0) );
    return r;
}