@java.lang.Override
public java.lang.String toString() {
    com.github.taffy128s.tlcdbms.DataRecord[] records = ((com.github.taffy128s.tlcdbms.DataRecord[]) (mTable.toArray()));
    java.lang.StringBuilder stringBuilder = new java.lang.StringBuilder();
    stringBuilder.append(mTablename).append("\n");
    for (com.github.taffy128s.tlcdbms.DataRecord record : records) {
        stringBuilder.append(record.toString());
    }
    return stringBuilder.toString();
}