public void unbindConditionEvaluator(org.apache.unomi.persistence.elasticsearch.ServiceReference<org.apache.unomi.persistence.elasticsearch.ConditionEvaluator> conditionEvaluatorServiceReference) {
    conditionEvaluatorDispatcher.removeEvaluator(conditionEvaluatorServiceReference.getProperty("conditionEvaluatorId").toString(), conditionEvaluatorServiceReference.getBundle().getBundleId());
}