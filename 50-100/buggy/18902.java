@java.lang.Override
public java.lang.String getDatasetProperties(java.lang.String definitionName, org.talend.components.service.rest.dto.FormDataContainer formData) {
    org.talend.components.common.datastore.DatastoreDefinition<org.talend.components.common.datastore.DatastoreProperties> datastoreDefinition = definitionServiceDelegate.getDefinitionsMapByType(org.talend.components.common.datastore.DatastoreDefinition.class).get(definitionName);
    org.apache.commons.lang3.Validate.notNull(datastoreDefinition, "Could not find data store definition of name %s", definitionName);
    org.talend.components.common.datastore.DatastoreProperties properties = getPropertiesFromJson(datastoreDefinition, formData.getFormData());
    org.talend.components.common.dataset.DatasetProperties datasetProperties = datastoreDefinition.createDatasetProperties(properties);
    return datasetProperties == null ? "{}" : jsonSerializationHelper.toJson(datasetProperties);
}