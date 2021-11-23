private void validateInactive(java.lang.Boolean preInactive, java.lang.Boolean curInactive) {
    if (((preInactive != null) && (preInactive == true)) && ((curInactive == null) || (curInactive == false))) {
        java.lang.String errMsg = java.lang.String.format("%s invalid inactive set from %s to %s", this.getId().toString(), preInactive, curInactive);
        com.emc.storageos.db.client.model.DataObject._log.error(errMsg, new java.lang.IllegalArgumentException());
    }
}