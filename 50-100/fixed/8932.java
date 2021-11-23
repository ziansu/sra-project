public static boolean generate() {
    com.sheepit.client.hardware.gpu.GPU.devices = new java.util.LinkedList<com.sheepit.client.hardware.gpu.GPUDevice>();
    java.util.List<com.sheepit.client.hardware.gpu.GPUDevice> gpus = new com.sheepit.client.hardware.gpu.nvidia.Nvidia().getGpus();
    if (gpus != null) {
        com.sheepit.client.hardware.gpu.GPU.devices.addAll(gpus);
    }
    gpus = new com.sheepit.client.hardware.gpu.opencl.OpenCL().getGpus();
    if (gpus != null) {
        com.sheepit.client.hardware.gpu.GPU.devices.addAll(gpus);
    }
    return true;
}