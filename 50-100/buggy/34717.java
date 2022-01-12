public void drawImage3(final java.lang.String url, final java.lang.Double sourceX, final java.lang.Double sourceY, final java.lang.Double sourceWidth, final java.lang.Double sourceHeight, final java.lang.Double destX, final java.lang.Double destY, final java.lang.Double destWidth, final java.lang.Double destHeight) {
    runCommand(new com.google.gwt.user.client.Command() {
        @java.lang.Override
        public void execute() {
            ctx.drawImage(com.google.gwt.dom.client.ImageElement.as(new com.google.gwt.user.client.ui.Image(url).getElement()), sourceX, sourceY, sourceWidth, sourceHeight, destX, destY, destWidth, destHeight);
        }
    });
}