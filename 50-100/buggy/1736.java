void cullAndRender(org.gearvrf.GVRRenderTarget renderTarget, org.gearvrf.GVRScene scene) {
    cullAndRender(scene.getNative(), renderTarget.getNative(), mRenderBundle.getMaterialShaderManager().getNative(), mRenderBundle.getPostEffectShaderManager().getNative(), mRenderBundle.getPostEffectRenderTextureA().getNative(), mRenderBundle.getPostEffectRenderTextureB().getNative());
}