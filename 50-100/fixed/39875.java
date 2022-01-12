public void onTextureError(org.gearvrf.GVRContext context, java.lang.String error, java.lang.String texFile) {
    org.gearvrf.utility.Log.e(org.gearvrf.GVRAssetLoader.TAG, "ASSET: ERROR: texture did %s not load %s", texFile, error);
    mErrors += ((("Texture " + texFile) + " did not load ") + error) + "\n";
    if ((((mNumTextures)--) == 0) && ((mModel) != null)) {
        generateLoadEvent();
    }
}