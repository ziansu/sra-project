private void updatePrefViewportHeight() {
    double lineHeight = fontMetrics.get().getLineHeight();
    int rowCount = getSkinnable().getPrefRowCount();
    javafx.geometry.Insets contentPadding = contentView.getInsets();
    scrollPane.setPrefViewportHeight((((rowCount * lineHeight) + (contentPadding.getTop())) + (contentPadding.getBottom())));
}