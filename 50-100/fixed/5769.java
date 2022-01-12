public static org.jfree.chart.JFreeChart createBoxPlot(final com.health.Table table) {
    com.health.Column column = null;
    for (com.health.Column c : table.getColumns()) {
        if ((c.getType()) == (com.health.ValueType.Number)) {
            column = c;
            break;
        }
    }
    if (column == null) {
        return null;
    }
    return com.health.visuals.BoxPlot.createBoxPlot(table, column.getName());
}