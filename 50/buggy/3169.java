@java.lang.Override
public java.awt.image.BufferedImage performOperation(java.awt.image.BufferedImage bi) {
    ij.process.ByteProcessor bp = new ij.process.ByteProcessor(oct.util.Util.deepCopyBufferedImage(bi));
    bp.toFloat(0, null);
    bp.blurGaussian(blurFactor);
    return bp.getBufferedImage();
}