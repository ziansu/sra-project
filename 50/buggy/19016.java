@java.lang.Override
public boolean shouldSchedule() {
    if (this.completionAssistantIsActive)
        return false;
    
    return com.laboki.eclipse.plugin.jcolon.main.EditorContext.taskDoesNotExist(EditorContext.ERROR_CHECKING_FAMILY);
}