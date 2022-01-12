public static void main(java.lang.String[] args) {
    new starter.CheckFolders();
    custom.Config.PropTest();
    custom.Config.LoadPropTest();
    view.MainFrame frame = view.MainFrame.getInstance();
    view.PanelHolder holder = view.PanelHolder.getInstance();
    frame.add(holder);
    frame.setVisible(true);
}