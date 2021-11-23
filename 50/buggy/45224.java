public final void advance(ontology.Types.ACTIONS action) {
    if (!(isEnded)) {
        tick(action);
        eventHandling();
        clearAll();
        terminationHandling();
        checkTimeOut();
        updateAllObservations();
        (gameTick)++;
    }
}