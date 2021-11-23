private void runProcessorsHook(int pRenderLayerIndex) {
    for (final clearvolume.renderer.processors.Processor<?> lProcessor : mProcessorsMap.values())
        if (lProcessor.isCompatibleProcessor(getClass())) {
            final clearvolume.renderer.processors.CUDAProcessor<?> lCUDAProcessor = ((clearvolume.renderer.processors.CUDAProcessor<?>) (lProcessor));
            lCUDAProcessor.applyToArray(mVolumeDataCudaArrays[pRenderLayerIndex]);
            lCUDAProcessor.process(pRenderLayerIndex, getVolumeSizeX(), getVolumeSizeY(), getVolumeSizeZ());
        }
    
}