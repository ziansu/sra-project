@java.lang.Override
public void setBrightness(final int pRenderLayerIndex, final double pBrightness) {
    mBrightness[pRenderLayerIndex] = ((float) (clearvolume.renderer.ClearVolumeRendererBase.clamp(pBrightness, 0, ((getBytesPerVoxel()) == 1 ? 16 : 256))));
    notifyUpdateOfVolumeRenderingParameters();
}