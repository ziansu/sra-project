public void setVec4Vector(java.lang.String key, float[] vec4Vector) {
    checkValidFloatVector("key", key, "vec4Vector", vec4Vector, 4);
    org.gearvrf.NativeMesh.setVec4Vector(getNative(), key, vec4Vector);
}