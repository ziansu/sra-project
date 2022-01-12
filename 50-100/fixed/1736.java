void cullAndRender(org.gearvrf.GVRRenderTarget renderTarget, org.gearvrf.GVRScene scene) {
    cullAndRender(renderTarget.getNative(), scene.getNative(), mRenderBundle.getMaterialShaderManager().getNative(), mRenderBundle.getPostEffectShaderManager().getNative(), mRenderBundle.getPostEffectRenderTextureA().getNative(), mRenderBundle.getPostEffectRenderTextureB().getNative());
}