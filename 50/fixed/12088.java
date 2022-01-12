public void generateBlurPasses() {
    if ((renderingConfig.getBlurIntensity()) != 0) {
        org.terasology.monitoring.PerformanceMonitor.startActivity("Generating Blur Passes");
        generateBlur(buffers.sceneBlur0);
        generateBlur(buffers.sceneBlur1);
        org.terasology.monitoring.PerformanceMonitor.endActivity();
    }
}