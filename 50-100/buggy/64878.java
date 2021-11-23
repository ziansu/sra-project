@java.lang.SuppressWarnings(value = "rawtypes")
public java.util.List<java.lang.String> getColumnSortOrder() {
    java.util.List<java.lang.String> list = new java.util.ArrayList<java.lang.String>();
    for (javafx.scene.control.TableColumn col : getSortOrder())
        list.add((((col.getText()) + "/") + (col.getSortType())));
    
    return list;
}