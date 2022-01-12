@java.lang.Override
public synchronized java.awt.image.BufferedImage capture() {
    if ((thread) == null) {
        setDeviceIndex(deviceIndex);
    }
    try {
        org.opencv.core.Mat mat = new org.opencv.core.Mat();
        if (!(fg.read(mat))) {
            return null;
        }
        java.awt.image.BufferedImage img = org.openpnp.util.OpenCvUtils.toBufferedImage(mat);
        mat.release();
        return transformImage(img);
    } catch (java.lang.Exception e) {
        return null;
    }
}