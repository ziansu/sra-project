@org.junit.Test
public void testGroupIncludesWithOutOfServiceRepository() throws java.io.IOException, java.security.NoSuchAlgorithmException {
    java.lang.System.out.println("# Testing group includes with out of service repository...");
    configurationManager.getConfiguration().getStorage("storage0").getRepository("releases").putOutOfService();
    java.io.InputStream is = groupLocationResolver.getInputStream("storage0", "group-releases", "com/artifacts/in/releases/foo/1.2.4/foo-1.2.4.jar");
    org.junit.Assert.assertNull(is);
    org.junit.Assert.assertThat(logs.contains(("Located artifact via wildcard routing rule [storage0:releases]:" + " [+]: .*(com|org)/artifacts.in.releases.with.trash.* after 2 hops.")), org.hamcrest.CoreMatchers.is(false));
    org.carlspring.strongbox.resource.ResourceCloser.close(is, null);
}