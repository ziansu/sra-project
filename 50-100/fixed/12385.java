@org.junit.Test
public void testGetChildrenModules_noChildren() {
    org.talend.core.model.process.INode node = org.mockito.Mockito.mock(org.talend.core.model.process.INode.class);
    org.talend.core.model.components.IComponent component = org.mockito.Mockito.mock(org.talend.core.model.components.IComponent.class);
    org.mockito.Mockito.when(node.getComponent()).thenReturn(component);
    org.mockito.Mockito.when(component.getName()).thenReturn("tLogRow");
    java.util.List<org.talend.core.model.general.ModuleNeeded> childrenModules = org.talend.designer.core.utils.JavaProcessUtil.getChildrenModules(node, java.util.Collections.emptySet(), false);
    org.junit.Assert.assertTrue(childrenModules.isEmpty());
}