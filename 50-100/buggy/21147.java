@java.lang.Override
public boolean setVolumeDataBuffer(int pRenderLayerIndex, java.nio.ByteBuffer pByteBuffer, long pSizeX, long pSizeY, long pSizeZ, double pVoxelSizeX, double pVoxelSizeY, double pVoxelSizeZ) {
    return setVolumeDataBuffer(clearvolume.renderer.ClearVolumeRendererBase.cDefaultSetVolumeDataBufferTimeout, java.util.concurrent.TimeUnit.SECONDS, pRenderLayerIndex, pByteBuffer, pSizeX, pSizeY, pSizeZ, 1, 1, 1);
}