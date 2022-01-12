public void initialize(java.lang.String ontologyName) {
    uk.ac.pride.ols.web.service.model.Term term = new uk.ac.pride.ols.web.service.model.Term(null, ontologyName, null, null, null, null);
    rootNode = new javax.swing.tree.DefaultMutableTreeNode(new no.uib.olsdialog.util.TreeBrowser.TermNode(term, null));
    treeModel = new javax.swing.tree.DefaultTreeModel(rootNode);
    treeModel.addTreeModelListener(this);
    tree.addTreeExpansionListener(this);
    tree.setModel(treeModel);
}