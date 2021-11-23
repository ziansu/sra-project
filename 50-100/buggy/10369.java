@java.lang.Override
public void handle(javafx.event.ActionEvent event) {
    java.lang.String point = cmdAnimator.Prompts.promptUserForPoint();
    cmdAnimator.GUI.getInstance().buttonExecuteCalled = true;
    if (point.equalsIgnoreCase("background")) {
        cmdAnimator.GuiCommands.executeBackgroundImageAdditionCommand(cmdAnimator.GUI.getInstance(), canvasImage.getImageFilename());
    }else
        cmdAnimator.GuiCommands.executeImageAdditionCommand(cmdAnimator.GUI.getInstance(), canvasImage.getImageFilename(), point);
    
}