public void reset() {
    this.startNode = this;
    this.pathFrom = null;
    this.visited = false;
    this.costFromStart = 0;
    this.estimate = 0;
    this.totalCost = 0;
}