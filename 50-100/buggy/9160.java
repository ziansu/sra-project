public void export(java.lang.String extension, java.io.File file) {
    try {
        javax.imageio.ImageIO.write(this.image.getImage(), "JPG", new java.io.File(((file.getPath()) + extension)));
    } catch (java.io.IOException e) {
        javax.swing.JOptionPane.showMessageDialog(null, "There was a Problem Exporting the Image, Please report the bug to the Developers");
    }
}