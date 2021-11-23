public void setNormals(float[] normals) {
    checkValidFloatArray("normals", normals, 3);
    mAttributeKeys.add("a_normal");
    org.gearvrf.NativeMesh.setNormals(getNative(), normals);
}