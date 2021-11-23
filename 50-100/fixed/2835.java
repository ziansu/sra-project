public void initialPostProcessing() {
    org.terasology.monitoring.PerformanceMonitor.startActivity("Initial Post-Processing");
    prePostMaterial.enable();
    buffers.scenePrePost.bind();
    glClear(((GL_COLOR_BUFFER_BIT) | (GL_DEPTH_BUFFER_BIT)));
    renderFullscreenQuad();
    buffers.scenePrePost.unbind();
    org.terasology.monitoring.PerformanceMonitor.endActivity();
}