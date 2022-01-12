@org.junit.Before
public void setUp() throws java.lang.Exception {
    org.mockito.MockitoAnnotations.initMocks(this);
    repository = spy(new com.sefford.kor.repositories.DiskJsonRepository(folder, new com.google.gson.Gson(), loggable, com.sefford.kor.repositories.utils.TestElement.class));
    doNothing().when(((com.sefford.kor.repositories.DiskJsonRepository) (repository))).write(org.mockito.ArgumentMatchers.any());
}