@org.junit.Test
public void testVersion2() throws java.io.IOException, java.lang.InterruptedException {
    java.lang.String out = io.apigee.trireme.shell.test.ShellTest.launcher.execute(new java.lang.String[]{ "--version" });
    assertFalse(out.isEmpty());
    assertTrue(out.contains(io.apigee.trireme.shell.test.ShellTest.env.getDefaultNodeVersion()));
    assertTrue(out.contains(Version.TRIREME_VERSION));
}