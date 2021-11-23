private void notifyTrigger(long nbPointsSinceLastTrigger, fr.isen.twinmx.model.GraphDirection direction) {
    if ((previousGraphDirection) != direction) {
        if (notifyTriggers) {
            this.dataSets.notifyTrigger(nbPointsSinceLastTrigger, direction);
        }
    }else {
        if (notifyTriggers) {
            nbPointsSinceLastTrigger /= 2;
            fr.isen.twinmx.model.GraphDirection opposite = (direction == (GraphDirection.GOING_UP)) ? GraphDirection.GOING_DOWN : GraphDirection.GOING_UP;
            this.dataSets.notifyTrigger(nbPointsSinceLastTrigger, opposite);
            this.dataSets.notifyTrigger(nbPointsSinceLastTrigger, direction);
            this.previousGraphDirection = null;
        }
    }
    previousGraphDirection = direction;
}