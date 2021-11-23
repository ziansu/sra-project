private static java.awt.image.BufferedImage getImage(com.google.gson.JsonElement imgElement) {
    com.google.gson.JsonElement imgSrc = imgElement.getAsJsonObject().get("img_src");
    try {
        java.lang.String actualURLStringSent = imgSrc.getAsString().replaceAll("\"", "");
        return javax.imageio.ImageIO.read(new java.net.URL(actualURLStringSent));
    } catch (java.net.MalformedURLException malFormedURL) {
        space.exploration.mars.rover.utils.CameraUtil.logger.error("Malformed URL ", malFormedURL);
    } catch (java.io.IOException io) {
        space.exploration.mars.rover.utils.CameraUtil.logger.error("IOException", io);
    }
    return null;
}