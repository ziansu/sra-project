private java.lang.String getInList(java.util.List<java.lang.Integer> itemsFrom, java.util.ArrayList datasetFrom) {
    java.lang.String inList = "(";
    for (int pos : itemsFrom) {
        inList += (((com.ha81dn.webausleser.backend.tables.UniqueRecord) (datasetFrom.get(itemsFrom.get(pos)))).getId()) + ",";
    }
    return (inList.substring(0, ((inList.length()) - 1))) + ")";
}