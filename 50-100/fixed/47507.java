private void updatePrefViewportWidth() {
    int columnCount = getSkinnable().getPrefColumnCount();
    javafx.geometry.Insets contentPadding = contentView.getInsets();
    scrollPane.setPrefViewportWidth((((columnCount * (characterWidth)) + (contentPadding.getLeft())) + (contentPadding.getRight())));
}