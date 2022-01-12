@cucumber.api.java.Before
public void init() {
    graphUiUtil = new uk.co.ordnancesurvey.routing.GraphHopperUIUtil(uk.co.ordnancesurvey.gpx.graphhopper.IntegrationTestProperties.getTestProperty("graphHopperWebUrl"));
}