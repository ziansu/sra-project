@java.lang.Override
public java.util.List<? extends org.kuali.rice.krad.bo.BusinessObject> getSearchResults(java.util.Map<java.lang.String, java.lang.String> fieldValues) {
    super.setBackLocationDocFormKey(fieldValues);
    java.lang.String projectNumber = fieldValues.get(org.kuali.kra.excon.service.impl.ExconProjectLookupableHelperServiceImpl.PROJECT_NUMBER);
    fieldValues.remove(org.kuali.kra.excon.service.impl.ExconProjectLookupableHelperServiceImpl.PROJECT_NUMBER);
    fieldValues.remove(ExconProject.EXCON_SEQUENCE_STATUS_PROPERTY_STRING);
    fieldValues.put(ExconProject.EXCON_SEQUENCE_STATUS_PROPERTY_STRING, VersionStatus.ACTIVE.toString());
    java.util.List<org.kuali.kra.excon.project.ExconProject> unboundedResults = ((java.util.List<org.kuali.kra.excon.project.ExconProject>) (super.getSearchResultsUnbounded(fieldValues)));
    return unboundedResults;
}