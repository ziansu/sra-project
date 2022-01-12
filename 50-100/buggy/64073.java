public void setTexCoords(float[] texCoords, int index) {
    checkValidFloatArray("texCoords", texCoords, 2);
    mAttributeKeys.add("a_texcoord");
    java.lang.String key = (index > 0) ? "a_texcoord" + index : "a_texcoord";
    org.gearvrf.NativeMesh.setVec2Vector(getNative(), key, texCoords);
}