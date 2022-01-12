public void videoShow(java.awt.image.BufferedImage img) {
    try {
        java.awt.image.BufferedImage bufferedImage = client.VideoFrame.resize(img, Cfg.frame_width, Cfg.frame_height);
        label.setIcon(new javax.swing.ImageIcon(bufferedImage));
        if (!(frame.isVisible())) {
            frame.pack();
            frame.setVisible(true);
        }
    } catch (java.lang.Exception e) {
        java.lang.System.err.println("Unable to video img.");
    }
}