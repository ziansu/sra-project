@java.lang.Override
public java.util.List<java.util.Map<java.lang.String, java.lang.Object>> handle(android.database.Cursor cs) {
    java.util.List<java.util.Map<java.lang.String, java.lang.Object>> rows = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Object>>();
    while (!(cs.isLast())) {
        rows.add(this.handleRow(cs));
    } 
    return rows;
}