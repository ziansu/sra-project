public static java.awt.Image LoadImage(java.lang.String filename) {
    java.io.File imageFile = dataStorage.Loader.LoadFile(filename);
    java.awt.Image image = null;
    try {
        image = javax.imageio.ImageIO.read(imageFile);
    } catch (java.io.IOException e) {
        java.lang.System.out.println(e);
    }
    return image;
}