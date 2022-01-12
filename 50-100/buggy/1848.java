public void updatePath() {
    double pheromoneValue = 100 / (this.pointVisited.size());
    for (int i = 0; i < (this.pointVisited.size()); i++) {
        Point point = this.pointVisited.pop();
        point.setPheromone(((point.getPheromone()) + pheromoneValue));
    }
    this.pointVisited.clear();
}