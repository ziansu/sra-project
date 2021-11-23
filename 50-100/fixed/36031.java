public java.lang.String updateGeneratedImage() {
    java.lang.String name = ("generatedMap" + (new java.util.Date().getTime())) + ".png";
    name = "C:/Users/admin/IdeaProjects/IronFour/web/img/" + name;
    try {
        java.io.File output = new java.io.File(name);
        javax.imageio.ImageIO.write(this.getBackImage(), "png", output);
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
    return name;
}