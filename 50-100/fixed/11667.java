@org.junit.Test
public void testRunProjectWithPassingTests() {
    org.jboss.reddeer.swt.api.Shell workbenchShell = new org.jboss.reddeer.workbench.impl.shell.WorkbenchShell();
    org.jboss.tools.fuse.ui.bot.test.ProjectLocalRunTest.log.info("Run a project as Local Camel Context (Project contains a passing test case).");
    new org.jboss.reddeer.workbench.impl.editor.DefaultEditor("CamelContextXmlTest.java").activate();
    org.jboss.tools.fuse.ui.bot.test.utils.EditorManipulator.copyFileContent("resources/PassingTest.java");
    new org.jboss.tools.fuse.reddeer.projectexplorer.CamelProject(org.jboss.tools.fuse.ui.bot.test.ProjectLocalRunTest.PROJECT_NAME).runCamelContext();
    workbenchShell.setFocus();
    org.junit.Assert.assertFalse("This build should be successful.", new org.jboss.reddeer.eclipse.ui.console.ConsoleView().getConsoleText().contains("BUILD FAILURE"));
}