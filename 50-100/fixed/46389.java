public static void main(final java.lang.String[] args) {
    java.lang.System.setProperty("com.apple.mrj.application.apple.menu.about.name", "YAWL Editor");
    java.lang.System.setProperty("apple.laf.useScreenMenuBar", "true");
    if ((!(org.yawlfoundation.yawl.editor.ui.util.UserSettings.getPostUpdatesCompleted())) && (new org.yawlfoundation.yawl.editor.ui.update.PostUpdateTasks().go())) {
        org.yawlfoundation.yawl.editor.ui.util.UserSettings.setPostUpdatesCompleted(true);
    }
    org.yawlfoundation.yawl.editor.ui.YAWLEditor.main(args);
}