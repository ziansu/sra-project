public void updatePath() {
    double pheromoneValue = 100 / (this.pointVisited.size());
    int size = this.pointVisited.size();
    for (int i = 0; i < size; i++) {
        Point point = this.pointVisited.pop();
        point.setPheromone(((point.getPheromone()) + pheromoneValue));
    }
    this.pointVisited.clear();
}