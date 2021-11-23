@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent event) {
    challengeDialog.setSearchOpponent(((event.getSource()) == (menuButtons[0])));
    challengeDialog.reset();
}