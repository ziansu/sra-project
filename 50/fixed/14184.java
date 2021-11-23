@org.junit.Test
public void testVCSTypeString() {
    assertEquals(vcs.getVCSTypeString(), GitVCS.GIT_VCS_TYPE_STRING);
}