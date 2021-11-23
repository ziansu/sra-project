public static javafx.scene.image.Image getIcon(final java.lang.String base_name) throws java.lang.Exception {
    java.lang.String path = ("platform:/plugin/org.csstudio.javafx/icons/" + base_name) + ".png";
    return new javafx.scene.image.Image(org.csstudio.display.builder.util.ResourceUtil.openPlatformResource(path));
}