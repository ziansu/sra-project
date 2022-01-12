@java.lang.Override
public void setColumns(java.util.List<java.lang.String> columns) {
    if ((columns != null) && ((columns.size()) > 0)) {
        this.columns = columns;
        writeTo(columns.get(0));
        for (int i = 1; i < (columns.size()); ++i) {
            writeTo(("\t" + (columns.get(i))));
        }
        writeTo("\n");
        flushAll();
    }
}