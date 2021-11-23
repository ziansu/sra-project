@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent e) {
    java.util.ArrayList<java.lang.String> gameNames = this.getGameNames();
    java.lang.String chosenGameName = ((java.lang.String) (javax.swing.JOptionPane.showInputDialog(null, "Choose a game to load", "Game Loader", javax.swing.JOptionPane.QUESTION_MESSAGE, null, gameNames.toArray(), gameNames.get(0))));
    java.lang.String path = "src/resources/games/" + chosenGameName;
    parseGame(path);
}