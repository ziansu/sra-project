public void removeCell(java.lang.String id) {
    elegit.treefx.Cell cell = cellMap.get(id);
    if (cellMap.containsKey(cell.getCellId())) {
        elegit.treefx.Cell oldCell = cellMap.remove(cell.getCellId());
        for (elegit.treefx.Cell p : cell.getCellParents()) {
            p.removeCellChild(oldCell);
        }
        removedCells.add(oldCell);
        this.removeEdges(oldCell);
    }
}