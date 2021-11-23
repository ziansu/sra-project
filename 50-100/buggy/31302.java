public void setCastShadow(boolean enableFlag) {
    org.gearvrf.GVRContext context = getGVRContext();
    if (enableFlag) {
        if ((org.gearvrf.GVRLightBase.mShadowMaterial) == null) {
            org.gearvrf.GVRLightBase.mShadowMaterial = new org.gearvrf.GVRMaterial(context);
            org.gearvrf.GVRShaderTemplate depthShader = context.getMaterialShaderManager().retrieveShaderTemplate(org.gearvrf.GVRDepthShader.class);
            depthShader.bindShader(context, org.gearvrf.GVRLightBase.mShadowMaterial);
        }
        org.gearvrf.NativeLight.setCastShadow(getNative(), org.gearvrf.GVRLightBase.mShadowMaterial.getNative());
    }else {
        org.gearvrf.NativeLight.setCastShadow(getNative(), 0);
    }
}