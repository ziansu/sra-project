public void refreshPreviews() {
    if (dataHandler.getCurrentTechnique().isUsingShaderNodes()) {
        sortedNodes = dataHandler.sortNodes(diagramUiHandler.getNodesForSort());
        diagramUiHandler.refreshPreviews(gui, errorLog, matDef, sortedNodes, matParams);
    }
    shaderCodePanel.refreshCode(dataHandler.getCurrentTechnique(), matDef);
}