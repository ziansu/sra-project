@org.junit.Test(expected = org.motechproject.ghana.national.exception.FacilityAlreadyFoundException.class)
public void ShouldNotCreateAFacilityIfAlreadyExists() throws org.motechproject.ghana.national.exception.FacilityAlreadyFoundException {
    java.lang.String facilityName = "name";
    java.lang.String country = "country";
    java.lang.String region = "region";
    java.lang.String district = "district";
    java.lang.String province = "province";
    org.mockito.Mockito.when(mockAllFacilities.facilities()).thenReturn(java.util.Arrays.asList(new org.motechproject.ghana.national.domain.Facility(new org.motechproject.mrs.model.MRSFacility(facilityName, country, region, district, province))));
    facilityService.create(facilityName, country, region, district, province, StringUtils.EMPTY, StringUtils.EMPTY, StringUtils.EMPTY, StringUtils.EMPTY);
}