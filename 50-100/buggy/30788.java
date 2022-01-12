@cucumber.api.java.en.Given(value = "^I open the Location details for Location \"(.*?)\"$")
public void openDetailsLocation(java.lang.String locationName) {
    location.setName(locationName);
    location.setDisplayName(locationName);
    org.json.JSONObject jsonLocation = new org.json.JSONObject();
    jsonLocation.put(DomainAppConstants.KEY_CUSTOM_NAME, locationName);
    jsonLocation.put(DomainAppConstants.KEY_NAME, locationName);
    org.json.JSONObject response = api.MethodsAPI.post(jsonLocation, EndPoints.LOCATIONS);
    location.setId(response.getString(DomainAppConstants.KEY_ID));
    locationPage = homePage.getLeftMenuPanel().clickOnLocationPage();
    framework.UIMethods.refreshPage();
    locationInfoPage = locationPage.clickEditLocation(location);
}