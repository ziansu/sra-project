private void notifyTrigger(long nbPointsSinceLastTrigger, fr.isen.twinmx.model.GraphDirection direction) {
    if ((previousGraphDirection) != direction) {
        if (notifyTriggers) {
            this.dataSets.notifyTrigger(nbPointsSinceLastTrigger, direction);
        }
    }else {
        if (notifyTriggers) {
            nbPointsSinceLastTrigger /= 2;
            this.dataSets.notifyTrigger(nbPointsSinceLastTrigger, direction);
            this.dataSets.notifyTrigger(nbPointsSinceLastTrigger, direction);
            this.previousGraphDirection = null;
        }
    }
    previousGraphDirection = direction;
}