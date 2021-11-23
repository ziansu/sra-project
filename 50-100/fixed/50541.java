public void setCullFace(org.gearvrf.GVRRenderPass.GVRCullFaceEnum cullFace, int passIndex) {
    if (passIndex < (mRenderPassList.size())) {
        mRenderPassList.get(passIndex).setCullFace(cullFace);
    }else {
        android.util.Log.e(org.gearvrf.GVRRenderData.TAG, (("Trying to set cull face to a invalid pass. Pass " + passIndex) + " was not created."));
    }
}