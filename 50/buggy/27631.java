public void resetEntities() {
    for (int i = 1; i < (entities.size()); i++) {
        entities.get(i).resetEnt();
    }
}