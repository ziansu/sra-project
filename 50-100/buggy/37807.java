@java.lang.Override
public void setBrightness(final int pRenderLayerIndex, final double pBrightness) {
    mBrightness[getCurrentRenderLayerIndex()] = ((float) (clearvolume.renderer.ClearVolumeRendererBase.clamp(getBrightness(getCurrentRenderLayerIndex()), 0, ((getBytesPerVoxel()) == 1 ? 16 : 256))));
    notifyUpdateOfVolumeRenderingParameters();
}