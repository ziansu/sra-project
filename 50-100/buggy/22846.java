private void B_OwnersMouseClicked(java.awt.event.MouseEvent evt) {
    ScrollPane_Owner.setVisible(true);
    ScrollPane_Player.setVisible(false);
    ScrollPane_Team.setVisible(false);
    Panel_Person.setVisible(false);
    Panel_Buttons.setVisible(false);
    Panel_Statistics.setVisible(false);
    ScrollPane_TeamData.setVisible(false);
    Label_Close.setVisible(false);
    Panel_Person_Images.removeAll();
    currentTab = 1;
    Label_NotPlayed.setVisible(false);
}