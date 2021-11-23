@org.junit.Test(expected = java.lang.IllegalArgumentException.class)
public void exception_shouldReturnRootUids_empty_paths() {
    java.util.List<org.hisp.dhis.android.core.organisationunit.OrganisationUnit> orgUnits = new java.util.ArrayList<>(uids.length);
    orgUnits.add(org.hisp.dhis.android.core.organisationunit.OrganisationUnit.create(uids[0], null, null, null, null, null, null, null, null, null, null, "", null, null, null, null, false));
    org.hisp.dhis.android.core.organisationunit.OrganisationUnitStructure.getRootUids(orgUnits, userAccessibleOrgUnits);
}