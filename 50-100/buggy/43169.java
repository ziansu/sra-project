@org.junit.Test
public void testRunProjectWithFailingTests() {
    org.jboss.reddeer.swt.api.Shell workbenchShell = new org.jboss.reddeer.workbench.impl.shell.WorkbenchShell();
    org.jboss.tools.fuse.ui.bot.test.ProjectLocalRunTest.log.info("Run a project as Local Camel Context (Project contains a failing test case).");
    new org.jboss.reddeer.workbench.impl.editor.DefaultEditor("CamelContextXmlTest.java").activate();
    org.jboss.tools.fuse.ui.bot.test.utils.EditorManipulator.copyFileContent("resources/FailingTest.java");
    new org.jboss.tools.fuse.reddeer.projectexplorer.CamelProject(org.jboss.tools.fuse.ui.bot.test.ProjectLocalRunTest.PROJECT_NAME).runCamelContext(org.jboss.tools.fuse.ui.bot.test.ProjectLocalRunTest.PROJECT_CAMEL_CONTEXT);
    new org.jboss.reddeer.common.wait.WaitUntil(new org.jboss.reddeer.eclipse.condition.ConsoleHasText("BUILD FAILURE"), org.jboss.reddeer.common.wait.TimePeriod.getCustom(300));
    workbenchShell.setFocus();
}