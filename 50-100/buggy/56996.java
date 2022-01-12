@org.junit.Before
public void setUp() {
    com.medziku.motoresponder.logic.Settings settings = org.mockito.Mockito.mock(com.medziku.motoresponder.logic.Settings.class);
    org.mockito.Mockito.when(settings.getGeolocationRequestPatterns()).thenReturn(new java.lang.String[]{ "where are you" , "your location" });
    this.geolocationRequestRecognition = new com.medziku.motoresponder.logic.GeolocationRequestRecognition(settings);
}