private void setCurrentTool(java.lang.String toolName) {
    currentSelectedTool = sandboxTools.get(toolName);
    if ((currentSelectedTool) != null) {
        facade.sendNotification(com.uwsoft.editor.view.stage.SandboxMediator.SANDBOX_TOOL_CHANGED, currentSelectedTool);
        currentSelectedTool.initTool();
    }
}