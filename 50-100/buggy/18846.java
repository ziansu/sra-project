@java.lang.Override
protected com.vaadin.ui.Field<?> constructCustomField(com.ocs.dynamo.domain.model.EntityModel<com.ocs.dynamo.showcase.movies.Movie> entityModel, com.ocs.dynamo.domain.model.AttributeModel attributeModel, boolean viewMode, boolean searchMode) {
    if ("country".equals(attributeModel.getName())) {
        com.ocs.dynamo.ui.component.EntityComboBox<java.lang.Integer, com.ocs.dynamo.showcase.movies.Country> cb = new com.ocs.dynamo.ui.component.EntityComboBox(getEntityModelFactory().getModel(com.ocs.dynamo.showcase.movies.Country.class), attributeModel, allCountries);
        return cb;
    }
    return null;
}