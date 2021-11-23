@org.junit.Test
public void shouldNotReturnNextURLIfTheFeedHasLastEntryInIt() throws java.lang.Exception {
    org.springframework.mock.web.MockHttpServletRequest mockHttpServletRequest = new org.springframework.mock.web.MockHttpServletRequest(null, null, "/catchments/3026/encounters");
    java.util.ArrayList<org.freeshr.events.EncounterEvent> lastEventInTheFeed = new java.util.ArrayList<>();
    lastEventInTheFeed.add(new org.freeshr.events.EncounterEvent(null, new java.util.Date(), null));
    java.lang.String nextResultURL = controller.getNextResultURL(mockHttpServletRequest, lastEventInTheFeed, new java.util.Date());
    assertNull("For last event in the feed, should have returned null", nextResultURL);
}