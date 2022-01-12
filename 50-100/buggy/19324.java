@java.lang.Override
public java.lang.String getSelectorTablesAsString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    java.util.Iterator<com.stratio.crossdata.common.data.TableName> it = getSelectorTables().iterator();
    while (it.hasNext()) {
        com.stratio.crossdata.common.data.TableName t = it.next();
        if (t == null) {
            continue;
        }
        return t.getQualifiedName();
    } 
    return "";
}