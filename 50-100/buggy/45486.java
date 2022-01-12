private void B_PlayersMouseClicked(java.awt.event.MouseEvent evt) {
    ScrollPane_Player.setVisible(true);
    ScrollPane_Owner.setVisible(false);
    ScrollPane_Team.setVisible(false);
    Panel_Person.setVisible(false);
    Panel_Buttons.setVisible(false);
    Panel_Statistics.setVisible(false);
    ScrollPane_TeamData.setVisible(false);
    Label_Close.setVisible(false);
    currentTab = 0;
    Label_NotPlayed.setVisible(false);
}