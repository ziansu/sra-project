public void write(java.lang.String out) throws java.io.IOException {
    java.lang.String[] tmp = out.split("\\.");
    java.lang.String format = tmp[((tmp.length) - 1)];
    javax.imageio.ImageIO.write(image, format, new java.io.File(out));
}