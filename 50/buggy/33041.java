public void activateDepthTexture() {
    useDepthTexture = true;
    depthTexture = new de.nerogar.render.Texture2D("depth", 0, 0, null, de.nerogar.render.Texture2D.InterpolationType.NEAREST, de.nerogar.render.Texture2D.DataType.DEPTH);
    setResolution(screenProperties.getRenderWidth(), screenProperties.getRenderHeight());
}