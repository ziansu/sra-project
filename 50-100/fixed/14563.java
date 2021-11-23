public java.util.List<model.Cell> getNearAvailable() {
    java.util.List<model.Cell> cells = progress.getCells();
    java.util.Set<model.Cell> all = new java.util.HashSet<model.Cell>();
    for (model.Cell cell : cells) {
        all.addAll(getNearAvailable(cell));
    }
    return new java.util.ArrayList<model.Cell>(all);
}