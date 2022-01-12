public void onNodeExpand(org.primefaces.event.NodeExpandEvent event) {
    com.dbms.view.CmqBaseRelationsTreeHelper relationsSearchHelper = new com.dbms.view.CmqBaseRelationsTreeHelper(cmqBaseService, smqBaseService, meddraDictService, cmqRelationService);
    this.parentRelationsRoot = relationsSearchHelper.getRelationsNodeHierarchy(this.parentRelationsRoot, event.getTreeNode(), false);
}