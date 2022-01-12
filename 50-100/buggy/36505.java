public void reshape(javax.media.opengl.GLAutoDrawable drawable, int x, int y, int width, int height) {
    float[] mat = new float[16];
    mh.setPerspective(com.jogamp.opengl.math.FloatUtil.makePerspective(mat, 0, true, 0.78F, (((float) (width)) / height), 0.01F, 8.1F));
}