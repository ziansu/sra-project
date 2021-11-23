@java.lang.Override
public void initialize(java.net.URL url, java.util.ResourceBundle rb) {
    setLogo();
    volunteerBoard.prefWidthProperty().bind(containerForVolunteerBoard.widthProperty());
    addAllVolunteerCells();
    btnLogOut.setVisible(false);
    lblWelcome.setVisible(false);
    listGuilds.setItems(guildModel.getAllGuildNames(true));
    addListener();
}