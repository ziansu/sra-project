@org.junit.Test
public void testSingleRootNode() {
    try {
        final org.eclipse.xtext.parser.indentation.indentationAwareTestLanguage.Tree tree = this.parseHelper.parse("root");
        org.junit.Assert.assertNotNull(tree);
        org.junit.Assert.assertEquals(1, tree.getNodes().size());
        org.junit.Assert.assertEquals("root", org.eclipse.xtext.xbase.lib.IterableExtensions.<org.eclipse.xtext.parser.indentation.indentationAwareTestLanguage.TreeNode>head(tree.getNodes()).getName());
    } catch (java.lang.Throwable _e) {
        throw org.eclipse.xtext.xbase.lib.Exceptions.sneakyThrow(_e);
    }
}