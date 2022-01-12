private javafx.scene.image.ImageView loadIcon(java.lang.String fileName) {
    java.io.InputStream inputStream = scadinspect.gui.Main.class.getResourceAsStream((((Main.RESOURCES_DIR) + fileName) + ".png"));
    javafx.scene.image.Image image = new javafx.scene.image.Image(inputStream);
    javafx.scene.image.ImageView imageView = new javafx.scene.image.ImageView(image);
    return imageView;
}