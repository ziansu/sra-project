private void initVBOs(com.jogamp.opengl.GL2 gl) {
    for (int i = 0; i < (vboAttribRefs.length); i++) {
        vbos[i] = org.helioviewer.jhv.opengl.VBO.gen_float_VBO(vboAttribRefs[i], vboAttribLens[i]);
        vbos[i].init(gl);
    }
    ivbo = org.helioviewer.jhv.opengl.VBO.gen_index_VBO();
}