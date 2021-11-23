@java.lang.SuppressWarnings(value = { "rawtypes" , "unchecked" })
public void setColumnSortOrder(java.util.List<java.lang.String> list) {
    for (java.lang.String s : list) {
        if (s.equals(""))
            continue;
        
        javafx.scene.control.TableColumn col = columnList.get(s.split("/")[0]);
        col.setSortType(javafx.scene.control.TableColumn.SortType.valueOf(s.split("/")[1]));
        if (!(getSortOrder().contains(col)))
            getSortOrder().add(col);
        
    }
}