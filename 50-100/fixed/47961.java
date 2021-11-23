private org.springframework.data.mongodb.core.query.Criteria getCriteriaFromResourceQueries(java.util.List<com.bq.oss.lib.queries.request.ResourceQuery> resourceQueries) {
    java.util.List<org.springframework.data.mongodb.core.query.Criteria> criterias = new java.util.ArrayList<>();
    for (com.bq.oss.lib.queries.request.ResourceQuery resourceQuery : resourceQueries) {
        criterias.add(getCriteriaFromResourceQuery(resourceQuery));
    }
    if ((criterias.size()) == 1) {
        return criterias.get(0);
    }else {
        return new org.springframework.data.mongodb.core.query.Criteria().orOperator(criterias.toArray(new org.springframework.data.mongodb.core.query.Criteria[criterias.size()]));
    }
}