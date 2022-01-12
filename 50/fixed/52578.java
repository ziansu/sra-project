public void unbindConditionEvaluator(org.apache.unomi.persistence.elasticsearch.ServiceReference<org.apache.unomi.persistence.elasticsearch.ConditionEvaluator> conditionEvaluatorServiceReference) {
    if (conditionEvaluatorServiceReference == null) {
        return ;
    }
    conditionEvaluatorDispatcher.removeEvaluator(conditionEvaluatorServiceReference.getProperty("conditionEvaluatorId").toString());
}