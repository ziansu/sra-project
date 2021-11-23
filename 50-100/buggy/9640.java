@java.lang.Override
public int getCount() throws java.sql.SQLException {
    if ((filters.isEmpty()) && (orderBys.isEmpty()))
        return ((int) (columnView.longSize()));
    
    return columnView.rowCount(toQuery(0, filters));
}