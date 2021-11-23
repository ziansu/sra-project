private void finalPostProcessing(org.terasology.rendering.world.WorldRenderer.WorldRenderingStage renderingStage) {
    org.terasology.monitoring.PerformanceMonitor.startActivity("Rendering final scene");
    if (!(renderingDebugConfig.isEnabled())) {
        postMaterial.enable();
    }else {
        debugMaterial.enable();
    }
    if (!(renderingConfig.isOculusVrSupport())) {
        renderFinalMonoImage();
    }else {
        renderFinalStereoImage(renderingStage);
    }
    org.terasology.monitoring.PerformanceMonitor.endActivity();
}