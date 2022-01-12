public void forwardFailedEventPattern(org.eclipse.viatra.cep.core.api.patterns.InTrapComplexEventPattern op) {
    for (org.eclipse.viatra.cep.core.evm.CepEventSource source : sources) {
        if (source.getAutomaton().getEventPatternId().equalsIgnoreCase(op.getObservedEventPatternId())) {
            source.pushEvent(CepEventType.APPEARED, op);
            break;
        }
    }
}