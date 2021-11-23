@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent e) {
    state = MatrixEditor.EditorState.editing;
    int numLine = newLineNumberSelector.getItemAt(newLineNumberSelector.getSelectedIndex());
    int numColumn = newColumnNumberSelector.getItemAt(newColumnNumberSelector.getSelectedIndex());
    currentMatrix = new Matrice(numLine, numColumn, 0.0);
    matrixGrid = new MatrixGrid(currentMatrix, state);
    updateUIFromState();
}