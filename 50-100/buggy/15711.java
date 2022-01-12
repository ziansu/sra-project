protected void castShadow(org.gearvrf.GVRContext context) {
    if ((org.gearvrf.GVRLightBase.mShadowMaterial) == null) {
        org.gearvrf.GVRLightBase.mShadowMaterial = new org.gearvrf.GVRMaterial(context);
        org.gearvrf.GVRShaderTemplate depthShader = context.getMaterialShaderManager().retrieveShaderTemplate(org.gearvrf.GVRDepthShader.class);
        depthShader.bindShader(context, org.gearvrf.GVRLightBase.mShadowMaterial);
        org.gearvrf.NativeLight.castShadow(getNative(), org.gearvrf.GVRLightBase.mShadowMaterial.getNative());
    }
}