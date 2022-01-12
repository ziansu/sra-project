@org.junit.BeforeClass
public static void setup() {
    new org.jboss.reddeer.swt.impl.shell.WorkbenchShell().maximize();
    org.jboss.tools.fuse.ui.bot.test.utils.ProjectFactory.createProject(org.jboss.tools.fuse.ui.bot.test.DebuggerTest.PROJECT_NAME, org.jboss.tools.fuse.ui.bot.test.DebuggerTest.PROJECT_ARCHETYPE);
    new org.jboss.tools.fuse.reddeer.projectexplorer.CamelProject(org.jboss.tools.fuse.ui.bot.test.DebuggerTest.PROJECT_NAME).openCamelContext(org.jboss.tools.fuse.ui.bot.test.DebuggerTest.CAMEL_CONTEXT);
    org.jboss.tools.fuse.reddeer.editor.CamelEditor.switchTab("Design");
    org.jboss.tools.fuse.reddeer.editor.CamelEditor editor = new org.jboss.tools.fuse.reddeer.editor.CamelEditor(org.jboss.tools.fuse.ui.bot.test.DebuggerTest.CAMEL_CONTEXT);
    editor.setId("choice", org.jboss.tools.fuse.ui.bot.test.DebuggerTest.CHOICE);
    editor.setId("log", org.jboss.tools.fuse.ui.bot.test.DebuggerTest.LOG);
    editor.setId("log", org.jboss.tools.fuse.ui.bot.test.DebuggerTest.LOG2);
    editor.save();
    new org.jboss.tools.fuse.reddeer.view.ErrorLogView().deleteLog();
}