public void setIteration(final com.monits.agilefant.model.Iteration iteration) {
    this.iteration = iteration;
    setChanged();
    notifyObservers();
}