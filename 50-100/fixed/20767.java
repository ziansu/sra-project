public static void runLoadPanel() {
    GUI.GUIMain.frame.getContentPane().remove(GUI.GUIMain.panel);
    GUI.LoadPanel panelLoader = new GUI.LoadPanel();
    GUI.GUIMain.panel = panelLoader.getPanel();
    GUI.GUIMain.frame.getContentPane().add(GUI.GUIMain.panel);
    GUI.GUIMain.frame.invalidate();
    GUI.GUIMain.frame.validate();
}