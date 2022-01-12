private javax.swing.ImageIcon getImageForModule(com.prplplus.shipconstruct.Module m) {
    int scaleFactor = 32 / (java.lang.Math.max(3, java.lang.Math.max(m.width, m.height)));
    java.awt.Image i = m.image;
    if (i == null) {
        return null;
    }
    i = i.getScaledInstance(((m.width) * scaleFactor), ((m.height) * scaleFactor), java.awt.Image.SCALE_DEFAULT);
    return new javax.swing.ImageIcon(i);
}