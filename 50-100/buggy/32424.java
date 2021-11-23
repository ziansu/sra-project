public synchronized java.util.Set<it.polimi.tower4clouds.manager.Observer> getObservers(java.lang.String metric) throws it.polimi.tower4clouds.manager.NotFoundException {
    if (!(ruleIdByObservableMetric.containsKey(metric))) {
        throw new it.polimi.tower4clouds.manager.NotFoundException(metric);
    }
    java.util.Set<java.lang.String> observersIds = observersIdsByMetric.get(metric);
    java.util.HashSet<it.polimi.tower4clouds.manager.Observer> observers = new java.util.HashSet<it.polimi.tower4clouds.manager.Observer>();
    for (java.lang.String id : observersIds) {
        observers.add(observersById.get(id));
    }
    return observers;
}