public org.gearvrf.GVRTexture loadTexture(org.gearvrf.GVRAndroidResource resource, org.gearvrf.GVRAndroidResource.TextureCallback callback) {
    org.gearvrf.GVRTexture texture = new org.gearvrf.GVRTexture(mContext, org.gearvrf.GVRAssetLoader.DEFAULT_TEXTURE_PARAMETERS);
    org.gearvrf.GVRAssetLoader.TextureRequest request = new org.gearvrf.GVRAssetLoader.TextureRequest(resource, texture);
    org.gearvrf.asynchronous.GVRAsynchronousResourceLoader.loadTexture(mContext, org.gearvrf.GVRAssetLoader.mTextureCache, request, resource, org.gearvrf.GVRAssetLoader.DEFAULT_TEXTURE_PARAMETERS, org.gearvrf.GVRAssetLoader.DEFAULT_PRIORITY, GVRCompressedTexture.BALANCED);
    return texture;
}