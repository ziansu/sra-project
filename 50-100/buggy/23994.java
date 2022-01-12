@org.junit.Test
public void shouldAddNode() {
    uiNode = new com.thoughtworks.mindit.mindit.view.model.UINode("child2", 1, root.getId());
    org.mockito.ArgumentCaptor<com.thoughtworks.mindit.mindit.model.Node> argumentCaptor = org.mockito.ArgumentCaptor.forClass(com.thoughtworks.mindit.mindit.model.Node.class);
    presenter.addNode(uiNode);
    org.mockito.Mockito.verify(tracker).addChild(argumentCaptor.capture());
    junit.framework.Assert.assertEquals(uiNode.getId(), argumentCaptor.getValue().getId());
}