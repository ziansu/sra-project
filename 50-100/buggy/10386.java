public void setMatrixMode(final org.anddev.andengine.opengl.util.GLMatrixStacks.MatrixMode pMatrixMode) {
    this.mMatrixMode = pMatrixMode;
    switch (this.mMatrixMode) {
        case PROJECTION :
            this.mCurrentGLMatrixStack = this.mProjectionGLMatrixStack;
            return ;
        case MODELVIEW :
            this.mCurrentGLMatrixStack = this.mModelViewGLMatrixStack;
            return ;
        default :
            throw new java.lang.IllegalArgumentException((((("Unexpected " + (org.anddev.andengine.opengl.util.GLMatrixStacks.MatrixMode.class.getSimpleName())) + ": '") + pMatrixMode) + "'."));
    }
}