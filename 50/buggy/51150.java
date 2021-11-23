void drawRootLayer() {
    org.mozilla.gecko.gfx.Layer rootLayer = mView.getController().getRoot();
    if (rootLayer == null) {
        return ;
    }
    setScissorRect();
    rootLayer.draw(mPageContext);
    android.opengl.GLES20.glDisable(GLES20.GL_SCISSOR_TEST);
}