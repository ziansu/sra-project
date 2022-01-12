@java.lang.Override
public void onBackPressed() {
    if (!(mToolbarIsVisible)) {
        setFullScreen(false);
    }else
        if ((PaintroidApplication.currentTool.getToolType()) == (org.catrobat.paintroid.tools.ToolType.BRUSH)) {
            if (!(((org.catrobat.paintroid.tools.implementation.BaseTool) (PaintroidApplication.currentTool)).isToolOptionsActive())) {
                showSecurityQuestionBeforeExit();
            }
        }else {
            switchTool(ToolType.BRUSH);
        }
    
}