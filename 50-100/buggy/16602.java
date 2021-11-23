public com.raizlabs.android.dbflow.sql.builder.ConditionQueryBuilder<ModelClass> append(java.lang.String selection, java.lang.Object... selectionArgs) {
    java.lang.String toAppend = selection;
    if ((selection != null) && (selectionArgs != null)) {
        for (java.lang.Object o : selectionArgs) {
            toAppend = toAppend.replaceFirst("\\?", convertValueToString(o));
        }
    }
    mWhereRaw = toAppend;
    return super.append(toAppend);
}