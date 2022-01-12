private void add_to_table(javafx.collections.ObservableList<screensframework.reviews.ReviewController.ReviewItem> reviews, javafx.scene.control.TableView table) {
    table.setItems(null);
    table.setItems(reviews);
}