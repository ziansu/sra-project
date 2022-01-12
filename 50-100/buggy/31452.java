public void initialize() {
    final int size = java.lang.Math.max(mRenderer.getViewportWidth(), mRenderer.getViewportHeight());
    mRenderTarget = new org.rajawali3d.renderer.RenderTarget("colorPickerTarget", size, size, 0, 0, false, false, android.opengl.GLES20.GL_TEXTURE_2D, android.graphics.Bitmap.Config.ARGB_8888, org.rajawali3d.materials.textures.ATexture.FilterType.LINEAR, org.rajawali3d.materials.textures.ATexture.WrapType.CLAMP);
    mRenderer.addRenderTarget(mRenderTarget);
    mPickerMaterial = new org.rajawali3d.materials.Material();
    org.rajawali3d.materials.MaterialManager.getInstance().addMaterial(mPickerMaterial);
}