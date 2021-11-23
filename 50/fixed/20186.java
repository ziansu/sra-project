@org.junit.Test
public void shouldGetAllFacilities() {
    facilityService.facilities();
    verify(mockAllFacilities).facilities();
}