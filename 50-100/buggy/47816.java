public java.lang.Void execute(org.kie.internal.command.Context context) {
    org.kie.api.runtime.KieSession ksession = ((org.drools.core.command.impl.KnowledgeCommandContext) (context)).getKieSession();
    if ((this.outIdentifier) != null) {
        ((org.drools.core.impl.StatefulKnowledgeSessionImpl) (ksession)).getExecutionResult().getResults().put(this.outIdentifier, object);
    }
    ksession.setGlobal(this.identifier, this.object);
    return null;
}