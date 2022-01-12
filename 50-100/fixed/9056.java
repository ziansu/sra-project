void createMetadatasInDefaultSchemaIfInexistent(com.constellio.model.entities.Taxonomy taxonomy, java.lang.String schemaType) {
    if (!(getClassifiedObjects(taxonomy).contains(schemaType))) {
        java.lang.String groupLabel = com.constellio.app.ui.i18n.i18n.$("classifiedInGroupLabel");
        valueListServices().createAMultivalueClassificationMetadataInGroup(taxonomy, schemaType, "classifiedInGroupLabel", groupLabel);
    }
}