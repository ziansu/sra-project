private void updatePrefViewportWidth() {
    double characterWidth = fontMetrics.get().computeStringWidth("W");
    int columnCount = getSkinnable().getPrefColumnCount();
    javafx.geometry.Insets contentPadding = contentView.getInsets();
    scrollPane.setPrefViewportWidth((((columnCount * characterWidth) + (contentPadding.getLeft())) + (contentPadding.getRight())));
}