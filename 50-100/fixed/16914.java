@org.testng.annotations.Test(priority = 0)
public void pragueFlights() throws java.lang.Exception {
    destinationsPrague = new pages.airports.PragueDestinations(driver);
    driver.get(getLink("PRG"));
    possibleDestinations = destinationsPrague.getWebElements(destinationsPrague.getDestinationsXpath());
    possibleCountries = destinationsPrague.getWebElements(destinationsPrague.getCountriesXpath());
    possibleAirlines = destinationsPrague.getWebElements(destinationsPrague.getAirlinesXpath());
    saveFlight("Prague", possibleDestinations, possibleCountries, possibleAirlines);
}