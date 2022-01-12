private void prepareGameCells(java.util.List<com.sho.hire.hw.piserjohnmemory.concentration.ConcentrationCell> gameCells) {
    if (gameCells != null) {
        java.util.List<com.sho.hire.hw.piserjohnmemory.concentration.ConcentrationCell> duplicates = new java.util.ArrayList<>();
        for (com.sho.hire.hw.piserjohnmemory.concentration.ConcentrationCell gameCell : gameCells) {
            duplicates.add(gameCell.duplicate());
        }
        gameCells.addAll(duplicates);
        java.util.Collections.shuffle(gameCells);
    }
}