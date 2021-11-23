private org.hisp.dhis.validation.List<org.hisp.dhis.validation.ValidationResult> orderedList(org.hisp.dhis.validation.Collection<org.hisp.dhis.validation.ValidationResult> results) {
    org.hisp.dhis.validation.List<org.hisp.dhis.validation.ValidationResult> resultList = new org.hisp.dhis.validation.ArrayList(results);
    org.hisp.dhis.validation.Collections.sort(resultList);
    return resultList;
}