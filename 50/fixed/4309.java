public void writeToFile(java.io.File file, java.lang.String type) throws java.io.IOException {
    if (file == null) {
        throw new java.lang.IllegalArgumentException("File argument was null");
    }
    javax.imageio.ImageIO.write(img, type, file);
}