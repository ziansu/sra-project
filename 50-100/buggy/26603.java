@javafx.fxml.FXML
private void mangelClose() {
    mangel.setFkMangelstatus(mangelstatus);
    if ((dateMangelDatumende.getValue()) != null) {
        mangel.setAbschlussZeit(new java.util.GregorianCalendar(dateMangelDatumende.getValue().getDayOfMonth(), dateMangelDatumende.getValue().getMonthValue(), dateMangelDatumende.getValue().getYear()));
    }
    lblMangelStatus.setText("Abgeschlossen");
    client.proxy.updateMangel(mangel);
}