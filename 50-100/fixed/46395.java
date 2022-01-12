@org.junit.Test(expected = org.motechproject.ghana.national.exception.FacilityAlreadyFoundException.class)
public void ShouldNotCreateFacilityIfPhoneNumberAlreadyExists() throws org.motechproject.ghana.national.exception.FacilityAlreadyFoundException {
    java.lang.String facilityName = "name";
    java.lang.String country = "country";
    java.lang.String region = "region";
    java.lang.String district = "district";
    java.lang.String province = "province";
    java.lang.String testPhoneNumber = "0123456789";
    when(mockAllFacilities.facilities()).thenReturn(java.util.Arrays.asList(new org.motechproject.ghana.national.domain.Facility().phoneNumber(testPhoneNumber)));
    facilityService.create(facilityName, country, region, district, province, testPhoneNumber, StringUtils.EMPTY, StringUtils.EMPTY, StringUtils.EMPTY);
}