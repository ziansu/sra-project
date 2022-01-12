@java.lang.Override
public void valueChange(com.vaadin.data.Property.ValueChangeEvent event) {
    if (((event.getProperty()) != null) && ((event.getProperty().getValue()) != null)) {
        selectedSchemaType = ((com.constellio.app.ui.entities.MetadataSchemaVO) (event.getProperty().getValue())).getCode();
        if (((selectedSchemaType) != null) && ((selectedReporType) != null)) {
            fillTemplateComboBox(reportComboBox);
        }
    }
}