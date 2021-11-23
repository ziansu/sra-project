@java.lang.Override
public java.lang.String toString() {
    java.lang.Object[] records = mTable.toArray();
    java.lang.StringBuilder stringBuilder = new java.lang.StringBuilder();
    stringBuilder.append(mTablename).append("\n");
    for (java.lang.Object record : records) {
        stringBuilder.append(record.toString());
    }
    return stringBuilder.toString();
}