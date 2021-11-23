public void setImage(java.lang.String filename) {
    java.io.File imagePath = new java.io.File(filename);
    java.lang.System.out.println(imagePath.toURI().toString());
    java.lang.System.out.println(filename);
    try {
        imageBuffer = javax.imageio.ImageIO.read(imagePath);
    } catch (java.io.IOException e) {
        image = null;
        imageBuffer = null;
        return ;
    }
    java.lang.System.out.println(imagePath.toURI().toString());
    image = new javafx.scene.image.ImageView(imagePath.toURI().toString());
}