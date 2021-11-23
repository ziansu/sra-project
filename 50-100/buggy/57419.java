private void resizePreviewImage() {
    if ((previewIcon) != null) {
        java.awt.image.BufferedImage bufferedImg = new java.awt.image.BufferedImage(PreviewImagePanel.getWidth(), PreviewImagePanel.getHeight(), java.awt.image.BufferedImage.TYPE_INT_RGB);
        java.awt.Graphics g = bufferedImg.createGraphics();
        g.drawImage(previewIcon.getImage(), 0, 0, PreviewImagePanel.getWidth(), PreviewImagePanel.getHeight(), null);
        PreviewImagePanel.initializeImages();
        PreviewImagePanel.setImage(bufferedImg);
    }
}