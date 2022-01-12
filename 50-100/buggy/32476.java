private void addCategory(application.Task task, javafx.scene.layout.HBox hBox) {
    java.lang.String category = task.getCategory();
    javafx.scene.control.Label lblCategory;
    if (!(category.equalsIgnoreCase(Constant.CATEGORY_UNCATEGORISED))) {
        lblCategory = new javafx.scene.control.Label(task.getCategory());
        lblCategory.getStyleClass().add(Constant.CSS_CLASS_LABEL_CATEGORY);
        hBox.getChildren().add(lblCategory);
    }
}