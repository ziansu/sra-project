private void updatePrefViewportHeight() {
    int rowCount = getSkinnable().getPrefRowCount();
    javafx.geometry.Insets contentPadding = contentView.getInsets();
    scrollPane.setPrefViewportHeight((((rowCount * (lineHeight)) + (contentPadding.getTop())) + (contentPadding.getBottom())));
}