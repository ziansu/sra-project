private boolean validateCsvFields(java.lang.String[] fields, java.util.List<java.lang.String> properties, java.util.List<java.lang.String> unusedFields) {
    boolean containsId = false;
    if (fields == null)
        return false;
    
    for (java.lang.String f : fields) {
        if (Configuration.ID_FIELD_NAME.equals(f)) {
            containsId = true;
        }else {
            if (!(properties.contains(f))) {
                unusedFields.add(f);
            }
        }
    }
    return containsId;
}