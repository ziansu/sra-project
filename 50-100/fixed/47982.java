public void write() throws java.io.IOException {
    java.lang.String[] tmp = imageName.split("\\.");
    java.lang.String format = tmp[((tmp.length) - 1)];
    javax.imageio.ImageIO.write(image, format, new java.io.File(imagePath));
}