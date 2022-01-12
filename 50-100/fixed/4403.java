private void B_TeamsMouseClicked(java.awt.event.MouseEvent evt) {
    ScrollPane_Owner.setVisible(false);
    ScrollPane_Player.setVisible(false);
    ScrollPane_Team.setVisible(true);
    Panel_Person.setVisible(false);
    Panel_Buttons.setVisible(false);
    Panel_Statistics.setVisible(false);
    ScrollPane_TeamData.setVisible(false);
    Panel_Person_Images.removeAll();
    currentTab = 2;
    Label_NotPlayed.setVisible(false);
}