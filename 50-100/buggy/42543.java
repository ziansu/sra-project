public static org.lwjgl.openal.ALCdevice alcCaptureOpenDevice(java.lang.String devicename, int frequency, int format, int buffersize) {
    java.nio.ByteBuffer buffer = org.lwjgl.MemoryUtil.encodeASCII(devicename);
    long device_address = org.lwjgl.openal.ALC11.nalcCaptureOpenDevice(org.lwjgl.MemoryUtil.getAddress(buffer), frequency, format, buffersize);
    if (device_address != 0) {
        org.lwjgl.openal.ALCdevice device = new org.lwjgl.openal.ALCdevice(device_address);
        synchronized(ALC10.devices) {
            ALC10.devices.put(device_address, device);
        }
        return device;
    }
    return null;
}