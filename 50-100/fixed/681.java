@java.lang.Override
public synchronized java.awt.image.BufferedImage capture() {
    if ((thread) == null) {
        setDeviceIndex(deviceIndex);
    }
    org.opencv.core.Mat mat = new org.opencv.core.Mat();
    try {
        if (!(fg.read(mat))) {
            return null;
        }
        java.awt.image.BufferedImage img = org.openpnp.util.OpenCvUtils.toBufferedImage(mat);
        return transformImage(img);
    } catch (java.lang.Exception e) {
        return null;
    } finally {
        mat.release();
    }
}