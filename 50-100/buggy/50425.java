public void setLblAvatar(java.lang.String avatarID) {
    remove(lblAvatar);
    try {
        java.awt.Image imgAvatar = javax.imageio.ImageIO.read(getClass().getResource((("/avatars/" + avatarID) + ".png")));
        lblAvatar.setIcon(new javax.swing.ImageIcon(imgAvatar));
    } catch (java.lang.Exception ex) {
        ex.printStackTrace();
    }
    add(lblAvatar);
    repaint();
    revalidate();
}