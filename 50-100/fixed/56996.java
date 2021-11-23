@org.junit.Before
public void setUp() {
    com.medziku.motoresponder.logic.Settings settings = org.mockito.Mockito.mock(com.medziku.motoresponder.logic.Settings.class);
    java.util.List<java.lang.String> list = new java.util.ArrayList<>();
    list.add("where are you");
    list.add("your location");
    org.mockito.Mockito.when(settings.getGeolocationRequestPatterns()).thenReturn(list);
    this.geolocationRequestRecognition = new com.medziku.motoresponder.logic.GeolocationRequestRecognition(settings);
}