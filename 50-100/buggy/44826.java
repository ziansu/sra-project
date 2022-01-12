private void renderFinalMonoImage() {
    if (buffersManager.isNotTakingScreenshot()) {
        worldRenderer.renderFullscreenQuad(0, 0, org.lwjgl.opengl.Display.getWidth(), org.lwjgl.opengl.Display.getHeight());
    }else {
        buffers.sceneFinal.bind();
        glClear(((GL_COLOR_BUFFER_BIT) | (GL_DEPTH_BUFFER_BIT)));
        worldRenderer.renderFullscreenQuad(0, 0, fullScale.width(), fullScale.height());
        graphicState.bindDisplay();
        buffersManager.saveScreenshot();
    }
}