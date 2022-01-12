private void addDefaultBackground(java.lang.String buttonName, java.lang.String resourceName) {
    final java.io.InputStream is = com.shootoff.gui.pane.ArenaBackgroundsSlide.class.getResourceAsStream(resourceName);
    final com.shootoff.gui.LocatedImage img = new com.shootoff.gui.LocatedImage(is, resourceName);
    final java.io.InputStream isThumbnail = com.shootoff.gui.pane.ArenaBackgroundsSlide.class.getResourceAsStream(resourceName);
    final javafx.scene.image.ImageView thumbnailView = new javafx.scene.image.ImageView(new javafx.scene.image.Image(isThumbnail, 60, 60, true, true));
    itemPane.addButton(img, buttonName, java.util.Optional.of(thumbnailView), java.util.Optional.empty());
}