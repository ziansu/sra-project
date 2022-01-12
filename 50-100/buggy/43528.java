private java.lang.String generateGeologicUnitFilter(java.lang.String name, java.lang.String bboxString, java.lang.String serviceUrl) {
    org.auscope.portal.core.server.OgcServiceProviderType ogcServiceProviderType = org.auscope.portal.core.server.OgcServiceProviderType.parseUrl(serviceUrl);
    org.auscope.portal.core.services.methodmakers.filter.FilterBoundingBox bbox = org.auscope.portal.core.services.methodmakers.filter.FilterBoundingBox.attemptParseFromJSON(bboxString, ogcServiceProviderType);
    org.auscope.portal.gsml.YilgarnGeochemistryFilter yilgarnGeochemistryFilter = new org.auscope.portal.gsml.YilgarnGeochemistryFilter(name);
    if (bbox == null) {
        return yilgarnGeochemistryFilter.getFilterStringAllRecords();
    }else {
        return yilgarnGeochemistryFilter.getFilterStringBoundingBox(bbox);
    }
}