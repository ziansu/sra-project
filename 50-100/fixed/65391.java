public void repeatTexcoords(org.gearvrf.GVRMesh mesh) {
    float[] texcoords = mesh.getTexCoords();
    for (int i = 0; i < (texcoords.length); i++) {
        texcoords[i] *= 2.0F;
    }
    mesh.setVec2Vector("a_texcoord1", texcoords);
}