public org.anair.drools.model.FiredRulesReturnValues fireRules() {
    try {
        if (org.anair.drools.fluent.api.RulesExecution.RULES_LOG.isInfoEnabled()) {
            auditLoggingContext();
        }
        fireRules(true);
    } finally {
        fireRulesPostProcessor();
    }
    return firedRulesReturnValues;
}