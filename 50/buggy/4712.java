public int getImageWidth() throws java.io.IOException {
    if ((imgWidth) == 0) {
        imgWidth = reader.getWidth(0);
    }
    return imgWidth;
}