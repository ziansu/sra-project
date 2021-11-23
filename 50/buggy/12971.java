private hudson.tasks.Ant.AntInstallation configureDefaultAnt() throws java.lang.Exception {
    org.junit.rules.TemporaryFolder tmp = new org.junit.rules.TemporaryFolder();
    tmp.create();
    return org.jvnet.hudson.test.ToolInstallations.configureDefaultAnt(tmp);
}