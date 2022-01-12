public static java.util.List<com.sheepit.client.hardware.gpu.GPUDevice> listDevices(com.sheepit.client.Configuration config) {
    if ((com.sheepit.client.hardware.gpu.GPU.devices) == null) {
        if (config.getDetectGPUs()) {
            com.sheepit.client.hardware.gpu.GPU.generate();
        }else {
            new java.util.LinkedList<com.sheepit.client.hardware.gpu.GPUDevice>();
        }
    }
    return com.sheepit.client.hardware.gpu.GPU.devices;
}