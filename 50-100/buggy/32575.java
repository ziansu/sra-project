@org.junit.Test
public void testInlineCommentWithinExtendCodeBlock() throws com.github.mustachejava.MustacheException, java.io.IOException, java.lang.InterruptedException, java.util.concurrent.ExecutionException {
    java.io.File root = getRoot("commentWithinExtendCodeBlock.html");
    java.lang.System.out.println(("****** using root: " + root));
    com.github.mustachejava.MustacheFactory c = new com.github.mustachejava.DefaultMustacheFactory(root);
    com.github.mustachejava.Mustache m = c.compile("commentWithinExtendCodeBlock.html");
    java.io.StringWriter sw = new java.io.StringWriter();
    m.execute(sw, java.util.Collections.emptyList());
    org.junit.Assert.assertEquals(com.github.mustachejava.TestUtil.getContents(root, "commentWithinExtendCodeBlock.txt"), sw.toString());
}