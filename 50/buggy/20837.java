public void refreshPreviews(spix.swing.SwingGui gui, spix.swing.materialEditor.panels.ErrorLog errorLog, spix.swing.materialEditor.controller.MaterialDef matDef) {
    spix.swing.materialEditor.controller.MaterialPreviewRenderer previewRenderer = new spix.swing.materialEditor.controller.MaterialPreviewRenderer();
    previewRenderer.batchRequests(gui, errorLog, getOutPanelsForPreviews(), matDef, currentTechniqueName);
}