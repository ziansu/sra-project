public void updateModulePanel() {
    defineService.getDefinitionController().getDefineInternalFrame().addNewDefinitionPanel();
    if ((moduleIdOfModuleToSelectInUI) > 0) {
        defineService.getDefinitionController().setSelectedModuleId(moduleIdOfModuleToSelectInUI);
    }
}