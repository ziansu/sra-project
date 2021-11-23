public void drawImage2(final java.lang.String url, final java.lang.Double offsetX, final java.lang.Double offsetY, final java.lang.Double imageWidth, final java.lang.Double imageHeight) {
    ctx.drawImage(com.google.gwt.dom.client.ImageElement.as(new com.google.gwt.user.client.ui.Image(url).getElement()), offsetX, offsetY, imageWidth, imageHeight);
}