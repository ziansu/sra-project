public void update(java.util.List<model.Cycle> cycles) {
    this.cycles = cycles;
    for (model.Cycle cycle : cycles) {
        if (cycle.dead()) {
            occupiedCells.remove(cycle);
        }
        if (!(occupiedCells.containsKey(cycle))) {
            occupiedCells.put(cycle, new java.util.HashSet<>());
        }
        occupiedCells.get(cycle).add(cycle.head);
    }
}