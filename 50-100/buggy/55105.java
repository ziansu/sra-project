public void setMaterial(org.gearvrf.GVRMaterial material, int passIndex) {
    org.gearvrf.GVRMaterial oldmtl = getMaterial(passIndex);
    if (passIndex < (mRenderPassList.size())) {
        mRenderPassList.get(passIndex).setMaterial(material);
    }else {
        org.gearvrf.utility.Log.e(org.gearvrf.GVRRenderData.TAG, (("Trying to set material from invalid pass. Pass " + passIndex) + " was not created."));
    }
    if (oldmtl != material) {
        bindShader(getGVRContext().getMainScene());
    }
}