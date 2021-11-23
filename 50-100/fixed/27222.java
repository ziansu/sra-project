public org.gearvrf.GVRTexture loadTexture(org.gearvrf.GVRAndroidResource resource, org.gearvrf.GVRAndroidResource.TextureCallback callback, org.gearvrf.GVRTextureParameters texparams, int priority, int quality) {
    if (texparams == null) {
        texparams = org.gearvrf.GVRAssetLoader.DEFAULT_TEXTURE_PARAMETERS;
    }
    org.gearvrf.GVRTexture texture = new org.gearvrf.GVRTexture(mContext, texparams);
    org.gearvrf.GVRAssetLoader.TextureRequest request = new org.gearvrf.GVRAssetLoader.TextureRequest(resource, texture, callback);
    org.gearvrf.asynchronous.GVRAsynchronousResourceLoader.loadTexture(mContext, org.gearvrf.GVRAssetLoader.mTextureCache, request, resource, priority, quality);
    return texture;
}