private void initSaving(javafx.scene.control.TableView<de.rd.application.persistence.entities.Drug> tblv) {
    xmlImporter.write(xmlImporter.read());
    application.MediManagerMainFrameController.LOGGER.log(java.util.logging.Level.INFO, ("Saving to file... | " + (bookingOutTableView.getItems())));
}