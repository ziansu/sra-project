public java.util.List<com.yahoo.squidb.sql.Field<?>> qualifyFields(java.util.List<? extends com.yahoo.squidb.sql.Field<?>> fields) {
    if (fields == null) {
        return null;
    }
    java.util.List<com.yahoo.squidb.sql.Field<?>> result = new java.util.ArrayList<>(fields.size());
    for (com.yahoo.squidb.sql.Field<?> field : fields) {
        result.add(qualifyField(field));
    }
    return result;
}