private org.eclipse.scout.rt.client.ui.basic.tree.TreeEvent mockEvent(int type, java.lang.String... nodeIds) {
    return new org.eclipse.scout.rt.client.ui.basic.tree.TreeEvent(org.mockito.Mockito.mock(org.eclipse.scout.rt.client.ui.basic.tree.ITree.class), type, mockNodes(nodeIds));
}