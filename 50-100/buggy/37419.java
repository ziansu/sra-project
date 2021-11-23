private org.molgenis.data.validation.ConstraintViolation createConstraintViolation(org.molgenis.data.Entity entity, org.molgenis.data.AttributeMetaData attribute, org.molgenis.data.EntityMetaData meta, java.lang.String message) {
    java.lang.String fullMessage = java.lang.String.format("Invalid %s value '%s' for attribute '%s' of entity '%s'.", attribute.getDataType().getEnumType().toString().toLowerCase(), entity.getString(attribute.getName()), attribute.getLabel(), meta.getName());
    fullMessage += " " + message;
    return new org.molgenis.data.validation.ConstraintViolation(fullMessage, entity.getString(attribute.getName()), entity, attribute, meta, 0);
}