@java.lang.Override
public void onDrawFrame(javax.microedition.khronos.opengles.GL10 gl10) {
    outputSurface.awaitNewImage();
    outputSurface.drawImage(true);
    textureRender.render(outputSurface.getTextureRender().getTextureId(), outputSurface.getSurfaceTexture(), videoRotation);
}