private void pheromoneUpdate(int antIndex) {
    for (Utils.Pair<java.lang.Integer, java.lang.Integer> itr : ants[antIndex].visitedLink) {
        int u = itr.first;
        int v = itr.second;
        java.lang.System.out.println(((u + " ") + v));
        double updatedPheromone = (1 - (algorithm.aco.multi.source.ACO.EVAPORATION)) * (pheromone.get(u, v));
        pheromone.set(u, v, updatedPheromone);
    }
}