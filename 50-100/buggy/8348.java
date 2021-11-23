public void setMaterial(org.gearvrf.GVRMaterial material, int passIndex) {
    if (passIndex < (mRenderPassList.size())) {
        mRenderPassList.get(passIndex).setMaterial(material);
        org.gearvrf.NativeRenderData.setMaterial(getNative(), material.getNative(), passIndex);
    }else {
        android.util.Log.e(org.gearvrf.GVRRenderData.TAG, (("Trying to set material from invalid pass. Pass " + passIndex) + " was not created."));
    }
}