@org.junit.Test
public void testLastCommit() throws java.lang.Exception {
    org.junit.Assert.assertEquals(new java.util.Date(0), com.gitblit.utils.JGitUtils.getLastChange(null));
    org.eclipse.jgit.lib.Repository repository = com.gitblit.tests.GitBlitSuite.getHelloworldRepository();
    org.junit.Assert.assertTrue(((com.gitblit.utils.JGitUtils.getCommit(repository, null)) != null));
    java.util.Date date = com.gitblit.utils.JGitUtils.getLastChange(repository);
    repository.close();
    org.junit.Assert.assertNotNull("Could not get last repository change date!", date);
}