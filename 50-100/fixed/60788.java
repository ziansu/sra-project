protected final void makeNormal() {
    normal = new javax.vecmath.Vector3d();
    normal.cross(row, column);
    normal.normalize();
    normalArray = new double[3];
    normal.get(normalArray);
    normal = new javax.vecmath.Vector3d(normalArray);
}