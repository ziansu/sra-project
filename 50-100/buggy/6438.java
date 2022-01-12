public static int findMReference(java.awt.image.BufferedImage img) {
    java.awt.image.BufferedImage ref = qwop_ai.ImageParser.getBufferedImage(new java.io.File("ref/m.png"));
    for (int i = 0; i < ((img.getWidth()) - 40); i++) {
        if ((img.getRGB(i, 0)) == (ref.getRGB(0, 0))) {
            if (qwop_ai.ImageParser.compareColumn(img, ref, i, 0)) {
                return i;
            }
        }
    }
    return -1;
}