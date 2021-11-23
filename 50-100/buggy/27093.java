@java.lang.Override
public void mouseClicked(java.awt.event.MouseEvent arg0) {
    mainmodele.launchVocabGameGraphic(name, TypeOfGame.ENGLISH, 10, 2);
    Main.window.remove(Main.window.getContentPane());
    Main.window.setSize(600, 600);
    Main.window.setContentPane(new Window.PanelGameWindow(mainmodele));
    Main.window.getContentPane().validate();
}