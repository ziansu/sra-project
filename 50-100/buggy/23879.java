private static void transferPixels(java.awt.image.BufferedImage input, java.awt.image.BufferedImage output, int start, int end) {
    int inputY = 0;
    for (int y = start; y < end; y++) {
        for (int x = 0; x < (input.getWidth()); x++) {
            output.setRGB(x, y, input.getRGB(x, inputY));
        }
        inputY++;
    }
}