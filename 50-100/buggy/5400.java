public void actionPerformed(java.awt.event.ActionEvent e) {
    try {
        java.awt.image.BufferedImage image = javax.imageio.ImageIO.read(new java.io.File(twImages.getUrl()));
        javax.swing.JLabel lbl = new javax.swing.JLabel(new javax.swing.ImageIcon(image));
        javax.swing.JOptionPane.showMessageDialog(null, lbl, "ImageDialog", javax.swing.JOptionPane.PLAIN_MESSAGE, null);
    } catch (java.io.IOException e1) {
        e1.printStackTrace();
    }
}