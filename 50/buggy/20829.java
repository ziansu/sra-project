private javax.swing.ImageIcon getScaledImage(javax.swing.ImageIcon imageIcon) {
    return new javax.swing.ImageIcon(imageIcon.getImage().getScaledInstance(imageDimension.width, imageDimension.height, java.awt.Image.SCALE_SMOOTH));
}