public <F extends com.yahoo.squidb.sql.Field<?>> java.util.List<F> qualifyFields(java.util.List<F> fields) {
    if (fields == null) {
        return null;
    }
    java.util.List<F> result = new java.util.ArrayList<>(fields.size());
    for (F field : fields) {
        result.add(qualifyField(field));
    }
    return result;
}