public void setFloatVector(java.lang.String key, float[] floatVector) {
    checkValidFloatVector("key", key, "floatVector", floatVector, 1);
    org.gearvrf.NativeMesh.setFloatVector(getNative(), key, floatVector);
}