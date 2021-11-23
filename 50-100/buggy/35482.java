public final java.awt.Color getRowColor(int row) {
    if (row >= (myModel.getRowCount())) {
        return java.awt.Color.green;
    }
    int i = mapRowNumber(row);
    java.lang.Integer in = new java.lang.Integer(i);
    java.awt.Color c = rowColorMap.get(in);
    if ((c == null) && (!(rowColorMap.containsKey(in)))) {
        createRowColor(i);
        return rowColorMap.get(in);
    }else {
        return c;
    }
}