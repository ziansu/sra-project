public static org.opencv.core.Mat bufferedImageToMat(java.awt.image.BufferedImage bi) {
    org.opencv.core.Mat mat = new org.opencv.core.Mat(bi.getHeight(), bi.getWidth(), org.opencv.core.CvType.CV_8UC3);
    byte[] data = ((java.awt.image.DataBufferByte) (bi.getRaster().getDataBuffer())).getData();
    mat.put(0, 0, data);
    return mat;
}