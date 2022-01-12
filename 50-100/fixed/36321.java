@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent e) {
    java.lang.String action = e.getActionCommand();
    if (action.equals("Quit Game")) {
        frame.dispose();
        app.close();
    }
    if (action.equals("New Game")) {
        app.startNewGame();
    }
    if (action.equals("Load Game")) {
        app.loadGameData();
    }
}