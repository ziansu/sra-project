@org.junit.Before
public void setUp() {
    mockModel = org.mockito.Mockito.mock(ch.imedias.rsccfx.model.Rscc.class);
    supporterHelper = new ch.imedias.rsccfx.model.xml.SupporterHelper(mockModel);
    java.lang.String pathToDefaultSupporters = Rscc.REMOVE_FILE_IN_PATH.apply(getClass().getClassLoader().getResource(Rscc.DEFAULT_SUPPORTERS_FILE_NAME).getFile());
    org.mockito.Mockito.when(mockModel.getPathToDefaultSupporters()).thenReturn(pathToDefaultSupporters);
    supportersXml = "";
}