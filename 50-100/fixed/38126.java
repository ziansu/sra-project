public void setTexCoords(float[] texCoords, int index) {
    java.lang.String key = (index > 0) ? "a_texcoord" + index : "a_texcoord";
    checkValidFloatArray(key, texCoords, 2);
    org.gearvrf.NativeMesh.setVec2Vector(getNative(), key, texCoords);
}