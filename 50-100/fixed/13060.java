private void refreshModel(org.eclipse.viatra.cep.core.metamodels.events.Event event) {
    model.setLatestEvent(null);
    for (org.eclipse.viatra.cep.core.metamodels.automaton.EventToken eventToken : model.getEventTokensInModel()) {
        eventToken.setLastProcessed(null);
    }
    model.getEnabledForTheLatestEvent().clear();
    strategy.handleInitTokenCreation(model, AutomatonFactory.eINSTANCE);
    model.setLatestEvent(event);
    strategy.handleAutomatonResets(model, AutomatonFactory.eINSTANCE);
    cepUpdateCompleteProvider.latestEventHandled();
}