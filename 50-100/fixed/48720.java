@java.lang.Override
public org.terasology.rendering.opengl.FBO request(org.terasology.rendering.opengl.FBOConfig fboConfig) {
    org.terasology.rendering.opengl.FBO fbo;
    org.terasology.assets.ResourceUrn fboName = fboConfig.getName();
    if (fboConfigs.containsKey(fboName)) {
        if (!(fboConfig.equals(fboConfigs.get(fboName)))) {
            throw new java.lang.IllegalArgumentException("Requested FBO is already available with different configuration");
        }
        fbo = fboLookup.get(fboConfig.getName());
    }else {
        fbo = generateWithDimensions(fboConfig, shadowMapResolution);
    }
    retain(fboName);
    return fbo;
}