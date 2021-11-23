public void testParseSystemCapabilities() throws java.lang.Exception {
    aQute.launcher.plugin.Project project = ws.getProject("p1");
    project.prepare();
    java.lang.String systemCaps = null;
    try {
        aQute.launcher.plugin.ProjectLauncherImpl launcher = new aQute.launcher.plugin.ProjectLauncherImpl(project);
        launcher.prepare();
        systemCaps = launcher.getSystemCapabilities();
    } finally {
        project.close();
        ws.close();
    }
    assertEquals("osgi.native;osgi.native.osname:List<String>=\"Win7,Windows7,Windows 7\";osgi.native.osversion:Version=6.1", systemCaps);
}