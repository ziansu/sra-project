@java.lang.Override
public void set(javafx.scene.media.Media newValue) {
    super.set(newValue);
    java.lang.String rawName = new java.io.File(newValue.getSource()).getName();
    rawName = rawName.replaceAll("%20", " ");
    java.lang.String cleanName = rawName.substring(0, rawName.lastIndexOf('.'));
    mediaNameProperty.set(cleanName);
}