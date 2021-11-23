private void runProcessorsHook(int pRenderLayerIndex) {
    for (final clearvolume.renderer.processors.Processor<?> lProcessor : mProcessorsMap.values())
        if (lProcessor.isCompatibleProcessor(getClass())) {
            if (lProcessor instanceof clearvolume.renderer.processors.CUDAProcessor) {
                final clearvolume.renderer.processors.CUDAProcessor<?> lCUDAProcessor = ((clearvolume.renderer.processors.CUDAProcessor<?>) (lProcessor));
                lCUDAProcessor.applyToArray(mVolumeDataCudaArrays[pRenderLayerIndex]);
            }
            lProcessor.process(pRenderLayerIndex, getVolumeSizeX(), getVolumeSizeY(), getVolumeSizeZ());
        }
    
}