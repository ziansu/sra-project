@org.junit.Test
public void testSingleRootNode() {
    final org.eclipse.xtext.parser.indentation.indentationAwareTestLanguage.Tree tree = this.parse("root");
    org.junit.Assert.assertNotNull(tree);
    org.junit.Assert.assertEquals(1, tree.getNodes().size());
    org.junit.Assert.assertEquals("root", org.eclipse.xtext.xbase.lib.IterableExtensions.<org.eclipse.xtext.parser.indentation.indentationAwareTestLanguage.TreeNode>head(tree.getNodes()).getName());
}