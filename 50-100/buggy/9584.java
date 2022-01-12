public void write(java.lang.String out) {
    try {
        java.lang.String[] tmp = out.split("\\.");
        java.lang.String format = tmp[((tmp.length) - 1)];
        javax.imageio.ImageIO.write(image, format, new java.io.File(out));
    } catch (java.lang.Exception e) {
        javax.swing.JOptionPane.showMessageDialog(null, "Unknown error ocurred while writing to file!", "Write error", javax.swing.JOptionPane.ERROR_MESSAGE);
    }
}