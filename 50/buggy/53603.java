public void onStateChange(org.openelis.gwt.event.StateChangeEvent<org.openelis.gwt.screen.Screen.State> event) {
    reportToOrganizationName.getField().required = java.util.EnumSet.of(State.ADD, State.UPDATE).contains(event.getState());
    reportToTable.enable(true);
}