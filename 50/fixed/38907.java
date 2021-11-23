@org.junit.Before
public void setUp() throws java.lang.Exception {
    org.mockito.MockitoAnnotations.initMocks(this);
    when(dataManager.getDatabaseHelper()).thenReturn(databaseOpenHelper);
    when(databaseOpenHelper.getPlaceDao()).thenReturn(mockPlaceDao);
}