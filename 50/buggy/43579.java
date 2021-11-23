public void addLine(java.awt.Color color) {
    if ((selectionLines.size()) < 7) {
        selectionLines.add((activeLine = new edu.amd.spbstu.cg.util.UserSelectionLine(color)));
        repaint();
    }
    saveState();
}