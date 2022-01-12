public void glPopMatrix() {
    if (((this.mMatrixStackOffset) - (org.anddev.andengine.opengl.util.GLMatrixStack.GLMATRIX_SIZE)) <= (org.anddev.andengine.opengl.util.GLMatrixStack.GLMATRIXSTACKOFFSET_UNDERFLOW)) {
        throw new org.anddev.andengine.opengl.util.GLMatrixStack.GLMatrixStackUnderflowException();
    }
    this.mMatrixStackOffset -= org.anddev.andengine.opengl.util.GLMatrixStack.GLMATRIX_SIZE;
}