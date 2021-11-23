public java.util.List<com.yahoo.squidb.sql.Field<?>> qualifyFields(com.yahoo.squidb.sql.Field<?>... fields) {
    if (fields == null) {
        return null;
    }
    return qualifyFields(java.util.Arrays.asList(fields));
}