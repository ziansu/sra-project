private void onTrigger(long nbPointsSinceLastTrigger, fr.isen.twinmx.model.GraphDirection direction) {
    if (notifyTriggers) {
        this.dataSets.notifyTrigger(nbPointsSinceLastTrigger, direction);
    }
}