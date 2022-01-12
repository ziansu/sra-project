public java.lang.String buildSelectStatement(com.psddev.dari.db.Query<?> query) {
    try {
        com.psddev.dari.db.Query<?> strippedQuery = query.clone();
        strippedQuery.setDatabase(null);
        return sqlQueryCache.getUnchecked(strippedQuery);
    } catch (com.google.common.util.concurrent.UncheckedExecutionException e) {
        java.lang.Throwable cause = e.getCause();
        if (cause instanceof java.lang.RuntimeException) {
            throw ((java.lang.RuntimeException) (cause));
        }else {
            throw new com.psddev.dari.db.DatabaseException(this, cause);
        }
    }
}