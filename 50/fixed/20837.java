public void refreshPreviews(spix.swing.SwingGui gui, spix.swing.materialEditor.panels.ErrorLog errorLog, spix.swing.materialEditor.controller.MaterialDef matDef) {
    previewRenderer.batchRequests(gui, errorLog, getOutPanelsForPreviews(), matDef, currentTechniqueName);
}