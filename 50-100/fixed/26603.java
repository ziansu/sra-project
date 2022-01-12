@javafx.fxml.FXML
private void mangelClose() {
    mangel.setFkMangelstatus(mangelstatus);
    if ((dateMangelDatumende.getValue()) != null) {
        mangel.setAbschlussZeit(new java.util.GregorianCalendar(dateMangelDatumende.getValue().getYear(), ((dateMangelDatumende.getValue().getMonthValue()) - 1), dateMangelDatumende.getValue().getDayOfMonth()));
    }
    lblMangelStatus.setText("Abgeschlossen");
    client.proxy.updateMangel(mangel);
}