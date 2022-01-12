@java.lang.Override
public void updateItem(java.lang.String task, boolean empty) {
    super.updateItem(task, empty);
    if ((getTreeItem()) != null)
        java.lang.System.out.println((((getTreeItem().getValue()) + " ") + (getTreeItem().isExpanded())));
    
    if (!empty) {
        setAlignment(javafx.geometry.Pos.CENTER);
        setValue(task, getIndex());
        setGraphic(root);
    }else
        setGraphic(null);
    
}