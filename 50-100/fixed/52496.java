private void printDefaultAgendaStats() {
    if (org.anair.drools.fluent.api.RulesExecution.RULES_LOG.isInfoEnabled()) {
        for (java.util.Map.Entry<java.lang.String, org.drools.core.management.GenericKieSessionMonitoringImpl.AgendaStats.AgendaStatsData> entry : this.agendaStats.getRulesStats().entrySet()) {
            org.anair.drools.fluent.api.RulesExecution.RULES_LOG.info("{} | {}", entry.getKey(), entry.getValue());
            firedRulesReturnValues.getExecutedRules().add(entry.getKey());
        }
    }
}