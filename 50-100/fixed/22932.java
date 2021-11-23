@org.junit.Test
public void testSetCredentials() {
    vcs.setCredentials("user", "password");
    org.eclipse.jgit.transport.CredentialItem.Username u = new org.eclipse.jgit.transport.CredentialItem.Username();
    org.eclipse.jgit.transport.CredentialItem.Password p = new org.eclipse.jgit.transport.CredentialItem.Password();
    assertTrue(git.getCredentials().get(null, u, p));
    assertEquals(u.getValue(), "user");
    assertEquals(new java.lang.String(p.getValue()), "password");
}