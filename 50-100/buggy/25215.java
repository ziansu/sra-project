public java.awt.image.BufferedImage getCanvas() throws java.io.IOException {
    java.awt.image.BufferedImage image = getScreenshot();
    org.openqa.selenium.Dimension dimension = canvas.getRect().getDimension();
    org.openqa.selenium.Point location = canvas.getLocation();
    return image.getSubimage(location.x, location.y, dimension.width, dimension.height);
}