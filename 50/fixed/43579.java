public void addLine(java.awt.Color color) {
    selectionLines.add((activeLine = new edu.amd.spbstu.cg.util.UserSelectionLine(color)));
    saveState();
    repaint();
}