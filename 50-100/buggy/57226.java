public java.util.List<org.kuali.kra.bo.UnitAdministrator> getOspAdministrators() {
    java.util.List<org.kuali.kra.bo.UnitAdministrator> ospAdministrators = new java.util.ArrayList<org.kuali.kra.bo.UnitAdministrator>();
    for (org.kuali.kra.bo.UnitAdministrator unitAdministrator : getUnit().getUnitAdministrators()) {
        if (unitAdministrator.getUnitAdministratorType().getDescription().equals("OSP_ADMINISTRATOR")) {
            ospAdministrators.add(unitAdministrator);
        }
    }
    return ospAdministrators;
}