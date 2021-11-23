@org.junit.Test
public void testVCSTypeString() {
    org.junit.Assert.assertEquals(vcs.getVCSTypeString(), GitVCS.GIT_VCS_TYPE_STRING);
}