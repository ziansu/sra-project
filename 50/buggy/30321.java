public <F extends com.yahoo.squidb.sql.Field<?>> java.util.List<F> qualifyFields(F... fields) {
    if (fields == null) {
        return null;
    }
    return qualifyFields(java.util.Arrays.asList(fields));
}