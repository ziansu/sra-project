public void populate(edu.psu.sweng500.team8.coreDataStructures.Block block, edu.psu.sweng500.team8.play.GameSession gameSession, boolean isRefresh, java.awt.event.MouseAdapter mouseAdapter, boolean isPencilMarkMode) {
    for (int cellIndex = 0; cellIndex < 9; cellIndex++) {
        int rowIndex = cellIndex / 3;
        int columnIndex = cellIndex % 3;
        this.cells[rowIndex][columnIndex].populate(block.getCell(cellIndex), gameSession, isRefresh, mouseAdapter, isPencilMarkMode);
    }
}