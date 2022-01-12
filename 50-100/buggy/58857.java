@java.lang.Override
protected boolean isUnknown() {
    if ((this.queryAvailableFields) != null) {
        if ((fromDatastore.isUnknown()) == false) {
            if ((this.queryAvailableFields.getDatastoreDefinition(datastoreCombo.getValue())) == null) {
                return false;
            }
            if ((this.queryAvailableFields.getTableDefinition(datastoreCombo.getValue(), getValue())) == null) {
                return true;
            }
        }
    }
    return false;
}