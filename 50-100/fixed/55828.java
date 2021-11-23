@java.lang.Override
public void updateItem(model.CategoryI category, boolean empty) {
    super.updateItem(category, empty);
    if (category != null) {
        data = new gui.CategoryCell.CategoryData();
        data.setCategory(category);
        setGraphic(data.getBox());
    }else {
        setGraphic(null);
        setText(null);
    }
}