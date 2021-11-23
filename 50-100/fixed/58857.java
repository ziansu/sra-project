@java.lang.Override
protected boolean isUnknown() {
    if ((queryAvailableFields) != null) {
        if ((datastoreCombo.isUnknown()) == false) {
            if ((queryAvailableFields.getDatastoreDefinition(datastoreCombo.getValue())) == null) {
                return false;
            }
            if ((queryAvailableFields.getTableDefinition(datastoreCombo.getValue(), getValue())) == null) {
                return true;
            }
        }
    }
    return false;
}