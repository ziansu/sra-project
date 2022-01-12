public void setTable(javafx.scene.control.TableView<com.eiko.back.table.CellValue> content) {
    this.table = content;
    this.setContent(content);
    if ((table) == null)
        return ;
    
    int l = ((table.getItems().size()) + 1) * 40;
    this.setMinHeight(l);
    this.setMaxHeight(l);
    this.setPrefHeight(l);
}