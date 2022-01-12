@java.lang.SuppressWarnings(value = "CallToThreadDumpStack")
public static java.awt.image.BufferedImage getScaledImage(java.awt.image.BufferedImage srcImg, int w, int h) {
    java.awt.image.BufferedImage resizedImg = srcImg;
    if ((w < 10) || (h < 10)) {
        w = 10;
        h = 10;
    }
    try {
        resizedImg = net.coobird.thumbnailator.Thumbnails.of(srcImg).size(w, h).asBufferedImage();
    } catch (java.io.IOException ex) {
        ex.printStackTrace();
    }
    return resizedImg;
}