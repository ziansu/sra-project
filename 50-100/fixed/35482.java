public final java.awt.Color getRowColor(int row) {
    if (row >= (myModel.getRowCount())) {
        return java.awt.Color.green;
    }
    java.awt.Color c = rowColorMap.get(row);
    if ((c == null) && (!(rowColorMap.containsKey(row)))) {
        createRowColor(row);
        return rowColorMap.get(row);
    }else {
        return c;
    }
}