public void bindConditionESQueryBuilder(org.apache.unomi.persistence.elasticsearch.ServiceReference<org.apache.unomi.persistence.elasticsearch.ConditionESQueryBuilder> conditionESQueryBuilderServiceReference) {
    org.apache.unomi.persistence.elasticsearch.ConditionESQueryBuilder conditionESQueryBuilder = bundleContext.getService(conditionESQueryBuilderServiceReference);
    conditionESQueryBuilderDispatcher.addQueryBuilder(conditionESQueryBuilderServiceReference.getProperty("queryBuilderId").toString(), conditionESQueryBuilder);
}