public void updateGeneratedImage() {
    try {
        java.lang.String name = "generatedMap.png";
        java.io.File output = new java.io.File(("C:/Users/admin/IdeaProjects/IronFour/web/img/" + name));
        javax.imageio.ImageIO.write(this.getBackImage(), "png", output);
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}