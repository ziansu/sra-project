private void menuItemHybridGeneticActionPerformed(java.awt.event.ActionEvent evt) {
    if (((((puzzleFile) == null) || ((puzzleFileName) == null)) || ((c) == null)) || ((gui) == null)) {
        javax.swing.JOptionPane.showMessageDialog(null, "Puzzle file not loaded.", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
        throw new java.lang.IllegalStateException("Puzzle file not loaded.");
    }else {
        gui.solveHybridGenetic();
    }
}