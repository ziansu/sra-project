public synchronized void setFitness(double _fitness) {
    fitness = _fitness;
    fitnessCalculated = true;
    this.notifyAll();
}