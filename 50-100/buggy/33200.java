@java.lang.Override
protected void updateItem(org.jimple.planner.Task item, boolean bln) {
    super.updateItem(item, bln);
    if (item != null) {
        javafx.scene.text.Text t = new javafx.scene.text.Text(item.getTitle());
        t.getStyleClass().add("fancytext");
        javafx.scene.layout.VBox vBox = new javafx.scene.layout.VBox(t);
        javafx.scene.layout.HBox hBox = new javafx.scene.layout.HBox(new javafx.scene.text.Text(java.lang.String.format("#%d", item.getTaskId())), vBox);
        hBox.setSpacing(10);
        setGraphic(hBox);
    }
}