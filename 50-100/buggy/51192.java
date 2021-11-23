public java.lang.String getFieldName(java.lang.String entity, java.lang.String entityId, java.lang.String entityParentId, org.opensrp.form.domain.FormSubmission fs) {
    java.util.Map<java.lang.String, java.lang.String> m = new java.util.HashMap<java.lang.String, java.lang.String>();
    m.put("openmrs_entity", entity);
    m.put("openmrs_entity_id", entityId);
    m.put("openmrs_entity_parent", entityId);
    return formAttributeMapper.getFieldName(m, fs);
}