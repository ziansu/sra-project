@java.lang.Override
protected org.eclipse.scout.rt.client.ui.basic.tree.ITree createModel() throws org.eclipse.scout.commons.exception.ProcessingException {
    m_activeNodesFilter = new P_ActiveNodesFilter();
    m_matchingNodesFilter = new P_MatchingNodesFilter();
    org.eclipse.scout.rt.client.ui.basic.tree.ITree tree = new P_Tree();
    tree.setIconId(m_contentAssistField.getBrowseIconId());
    tree.addTreeListener(new org.eclipse.scout.rt.client.ui.basic.tree.TreeAdapter() {
        @java.lang.Override
        @java.lang.SuppressWarnings(value = "deprecation")
        public void treeChanged(org.eclipse.scout.rt.client.ui.basic.tree.TreeEvent e) {
            switch (e.getType()) {
                case org.eclipse.scout.rt.client.ui.basic.tree.TreeEvent.TYPE_NODE_EXPANDED :
                case org.eclipse.scout.rt.client.ui.basic.tree.TreeEvent.TYPE_NODE_COLLAPSED :
                    {
                        fireStructureChanged();
                        break;
                    }
            }
        }
    });
    return tree;
}