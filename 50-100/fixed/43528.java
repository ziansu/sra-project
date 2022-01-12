private java.lang.String generateGeologicUnitFilter(java.lang.String name, java.lang.String bboxString) {
    org.auscope.portal.core.services.methodmakers.filter.FilterBoundingBox bbox = org.auscope.portal.core.services.methodmakers.filter.FilterBoundingBox.attemptParseFromJSON(bboxString);
    org.auscope.portal.gsml.YilgarnGeochemistryFilter yilgarnGeochemistryFilter = new org.auscope.portal.gsml.YilgarnGeochemistryFilter(name);
    if (bbox == null) {
        return yilgarnGeochemistryFilter.getFilterStringAllRecords();
    }else {
        return yilgarnGeochemistryFilter.getFilterStringBoundingBox(bbox);
    }
}