private void getSoftwareDefinationTree() {
    this.softwareDefinitionTree = new husacct.define.presentation.moduletree.AnalyzedModuleTree(husacct.define.task.JtreeController.instance().getRootOfModel());
    this.softwareDefinitionTree.setTransferHandler(new husacct.define.presentation.draganddrop.customtransferhandlers.ModuleTrasferhandler());
    this.softwareDefinitionTree.addTreeSelectionListener(treeselectionListener);
    husacct.define.presentation.draganddrop.customdroptargetlisterner.SoftwareUnitDropListerner dropListener = new husacct.define.presentation.draganddrop.customdroptargetlisterner.SoftwareUnitDropListerner(softwareDefinitionTree);
    this.softwareDefinitionTree.setDragEnabled(true);
}