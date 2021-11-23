public final void advance(ontology.Types.ACTIONS action) {
    if (!(isEnded)) {
        tick(action);
        eventHandling();
        clearAll(this);
        terminationHandling();
        checkTimeOut();
        updateAllObservations();
        (gameTick)++;
    }
}