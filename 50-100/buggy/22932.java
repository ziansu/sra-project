@org.junit.Test
public void testSetCredentials() {
    vcs.setCredentials("user", "password");
    org.eclipse.jgit.transport.CredentialItem.Username u = new org.eclipse.jgit.transport.CredentialItem.Username();
    org.eclipse.jgit.transport.CredentialItem.Password p = new org.eclipse.jgit.transport.CredentialItem.Password();
    org.junit.Assert.assertTrue(git.getCredentials().get(null, u, p));
    org.junit.Assert.assertEquals(u.getValue(), "user");
    org.junit.Assert.assertEquals(new java.lang.String(p.getValue()), "password");
}