@java.lang.Override
public void setGpuDeviceId(int gpuDeviceId) {
    maybeInitBuilder();
    if (gpuDeviceId == (-1)) {
        builder.clearGpuDeviceId();
        return ;
    }
    builder.setGpuDeviceId(gpuDeviceId);
}