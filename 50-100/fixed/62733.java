@java.lang.Override
public void updateItem(java.lang.String task, boolean empty) {
    super.updateItem(task, empty);
    if (!empty) {
        setAlignment(javafx.geometry.Pos.CENTER);
        setValue(task, getIndex());
        setGraphic(root);
    }else
        setGraphic(null);
    
}