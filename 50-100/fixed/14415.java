public static void paintEverything(java.awt.Graphics2D g2, com.wpi.cs509.teamA.bean.GeneralMap map, java.awt.image.BufferedImage image, float scale) {
    com.wpi.cs509.teamA.ui.view.ImageComponent imageComponent = com.wpi.cs509.teamA.ui.view.ViewManager.getImageComponent();
    g2.drawImage(image, imageComponent.getImageXpos(), imageComponent.getImageYpos(), java.lang.Math.round(((image.getWidth(imageComponent)) * scale)), java.lang.Math.round(((image.getHeight(imageComponent)) * scale)), imageComponent);
}