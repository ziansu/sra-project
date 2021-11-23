protected java.awt.image.BufferedImage convolve(java.awt.image.BufferedImage img, float[] kernel, int filterWidth, int filterHeight) {
    java.awt.image.BufferedImage result = new java.awt.image.BufferedImage(img.getWidth(), img.getHeight(), img.getType());
    java.awt.image.Kernel k = createKernel(kernel, filterWidth, filterHeight);
    java.awt.image.ConvolveOp op = createConvolveOp(k);
    result = op.filter(img, null);
    return result;
}