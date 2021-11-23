@java.lang.Override
public org.oscarehr.common.model.ConsultationRequest getAsDomainObject(org.oscarehr.util.LoggedInInfo loggedInInfo, org.oscarehr.ws.rest.to.model.ConsultationDetailTo1 t) throws org.oscarehr.ws.rest.conversion.ConversionException {
    return getAsExistingDomainObject(loggedInInfo, t, new org.oscarehr.common.model.ConsultationRequest());
}