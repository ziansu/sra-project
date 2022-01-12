@java.lang.Override
@org.springframework.transaction.annotation.Transactional(value = TRANSACTION_MANAGER, readOnly = true)
public java.lang.Long countByJSONFilters(java.lang.String jsonfilters, java.lang.String query) {
    com.dot.gcpbasedot.dao.Parameters parameters = new com.dot.gcpbasedot.dao.Parameters();
    if ((jsonfilters != null) && (!(jsonfilters.equals("")))) {
        parameters = com.dot.gcpbasedot.util.FilterQueryJSON.processFilters(jsonfilters, entityClass);
    }
    if ((query != null) && (!(query.equals("")))) {
        parameters.whereQuery(query, getQueryParams());
    }
    return this.getGenericDao().countByParameters(parameters);
}