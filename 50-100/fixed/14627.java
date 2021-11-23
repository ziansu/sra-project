@org.junit.Test
public void testGetIndexOfChild() {
    final com.puppycrawl.tools.checkstyle.api.DetailAST nChild = tree.getFirstChild().getNextSibling().getNextSibling();
    final com.puppycrawl.tools.checkstyle.gui.ParseTreeTablePModel parseTree = new com.puppycrawl.tools.checkstyle.gui.ParseTreeTablePModel(null);
    final int index = parseTree.getIndexOfChild(tree, nChild);
    org.junit.Assert.assertEquals(2, index);
}