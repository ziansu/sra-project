protected void readColumns(java.util.List<java.lang.String> columns) {
    cols = columns;
    for (java.lang.String col : cols) {
        colType.put(col, nl.maastrichtuniversity.networklibrary.cyneo4j.internal.extensionlogic.impl.CypherResultParser.ResType.Unknown);
    }
}