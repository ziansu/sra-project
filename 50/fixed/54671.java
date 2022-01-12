public void onModelLoaded(org.gearvrf.GVRContext context, org.gearvrf.GVRSceneObject model, java.lang.String modelFile) {
    mModel = model;
    org.gearvrf.utility.Log.d(org.gearvrf.GVRAssetLoader.TAG, "ASSET: successfully loaded model %s", modelFile);
    if ((mNumTextures) == 0) {
        generateLoadEvent();
    }
}