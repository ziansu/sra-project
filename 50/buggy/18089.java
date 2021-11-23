private void play() {
    java.lang.System.out.println("Play");
    GUI.Pages.Window.getServerController().addTask(new Controllers.GUIData(Controllers.GUIData.GUI_COMMAND.RESUME));
}