@org.junit.Test
public void checkStyleTest() {
    org.jboss.tools.eclipsecs.ui.test.CheckstyleTest.log.step("Import tests project");
    org.jboss.tools.eclipsecs.ui.test.CheckstyleTest.importTestProject();
    org.jboss.reddeer.eclipse.jdt.ui.ProjectExplorer pe = new org.jboss.reddeer.eclipse.jdt.ui.ProjectExplorer();
    pe.open();
    pe.selectProjects("cstest");
    new org.jboss.reddeer.swt.impl.tree.DefaultTreeItem("cstest", "src", "org.jbds.cs", "CSTestClass.java").select();
    new org.jboss.reddeer.swt.impl.menu.ContextMenu("Checkstyle", "Check Code with Checkstyle");
    new org.jboss.reddeer.common.wait.WaitWhile(new org.jboss.reddeer.core.condition.JobIsRunning());
}