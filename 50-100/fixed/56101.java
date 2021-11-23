public com.yahoo.squidb.sql.Field<?> qualifyField(com.yahoo.squidb.sql.Field<?> field) {
    if (field instanceof com.yahoo.squidb.sql.Property<?>) {
        return ((com.yahoo.squidb.sql.Property<?>) (field)).asSelectionFromTable(this, null);
    }else {
        return com.yahoo.squidb.sql.Field.field(field.getName(), com.yahoo.squidb.sql.SqlTable.getName());
    }
}