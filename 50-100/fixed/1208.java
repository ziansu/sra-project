public void generateLightShafts() {
    if (renderingConfig.isLightShafts()) {
        org.terasology.monitoring.PerformanceMonitor.startActivity("Rendering light shafts");
        lightShaftsMaterial.enable();
        buffers.lightShafts.bind();
        graphicState.setViewportToSizeOf(buffers.lightShafts);
        glClear(((GL_COLOR_BUFFER_BIT) | (GL_DEPTH_BUFFER_BIT)));
        renderFullscreenQuad();
        buffers.lightShafts.unbind();
        graphicState.setViewportToFullScreen();
        org.terasology.monitoring.PerformanceMonitor.endActivity();
    }
}