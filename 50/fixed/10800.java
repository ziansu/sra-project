private org.apache.wicket.model.PropertyModel<java.util.List<org.cast.cwm.data.Period>> getPeriodsForUser() {
    return new org.apache.wicket.model.PropertyModel<java.util.List<org.cast.cwm.data.Period>>(sessionService.getUserModel(), "periodsAsList");
}