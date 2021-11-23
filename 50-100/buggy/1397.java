@java.lang.Override
public void failed(java.lang.Throwable t, org.gearvrf.GVRAndroidResource androidResource) {
    if (!(loadFinished)) {
        mAssetRequest.onTextureError(mAssetRequest.getContext(), t.getMessage(), TextureFile);
        loadFinished = true;
        loaded(org.gearvrf.GVRAssetLoader.getDefaultTexture(mAssetRequest.getContext()), null);
    }
}