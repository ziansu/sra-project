private com.constellio.app.ui.framework.components.Component createReportSelectorComboBox() {
    reportComboBox = new com.constellio.app.ui.framework.components.ComboBox();
    if (((selectedSchemaType) != null) && ((selectedReporType) != null)) {
        fillTemplateComboBox(reportComboBox);
    }
    reportComboBox.setCaption("Veuillez selectionner gabarit d'étiquette");
    reportComboBox.setWidth("100%");
    return reportComboBox;
}