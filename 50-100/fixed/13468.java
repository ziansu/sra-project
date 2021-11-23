@org.junit.Test
public void branchLinkUrlTest() throws java.io.UnsupportedEncodingException {
    java.lang.String ownerLoginid = "whiteship";
    java.lang.String proejctName = "yobi";
    java.lang.String branchName = "refs/heads/feature/review";
    java.lang.String url = routes.CodeApp.codeBrowserWithBranch(ownerLoginid, proejctName, branchName, "").url();
    org.fest.assertions.Assertions.assertThat(url).isEqualTo("/whiteship/yobi/code/refs%2Fheads%2Ffeature%2Freview");
}