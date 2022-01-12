public void registerStudyToolWindow(@org.jetbrains.annotations.Nullable
final com.jetbrains.edu.learning.courseFormat.Course course) {
    if (course != null) {
        final com.intellij.openapi.wm.ToolWindowManager toolWindowManager = com.intellij.openapi.wm.ToolWindowManager.getInstance(myProject);
        registerToolWindows(toolWindowManager);
        final com.intellij.openapi.wm.ToolWindow studyToolWindow = toolWindowManager.getToolWindow(StudyToolWindowFactory.STUDY_TOOL_WINDOW);
        if (studyToolWindow != null) {
            studyToolWindow.show(null);
            com.jetbrains.edu.learning.StudyUtils.initToolWindows(myProject);
        }
    }
}