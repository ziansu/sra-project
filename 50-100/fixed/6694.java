@org.junit.Test
@junitparams.Parameters(value = { "astText.md, astText.ast" })
public void dumpAST(java.lang.String mkdSrc, java.lang.String astSrc) throws java.io.IOException {
    java.lang.String mkd = loadResource(mkdSrc).trim();
    java.lang.String ast = loadResource(astSrc).trim();
    org.pegdown.PegDownProcessor processor = new org.pegdown.PegDownProcessor(org.pegdown.Extensions.ALL);
    org.pegdown.ast.RootNode rootNode = processor.parseMarkdown(normalize(mkd).toCharArray());
    java.lang.String s = dumpAST(rootNode);
    org.assertj.core.api.Assertions.assertThat(normalize(s.trim())).isEqualTo(normalize(ast));
}