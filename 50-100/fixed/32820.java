@org.junit.Test
public void test_clean_all() throws java.lang.Exception {
    java.io.File tempFolder = temp.newFolder();
    when(serverFileSystem.getTempDir()).thenReturn(tempFolder);
    java.io.File cacheLocation = dryRunCache.getCacheLocation(null);
    org.apache.commons.io.FileUtils.forceMkdir(cacheLocation);
    dryRunCache.cleanAll();
    verify(propertiesDao).deleteAllProperties(PreviewCache.SONAR_PREVIEW_CACHE_LAST_UPDATE_KEY);
    org.assertj.core.api.Assertions.assertThat(cacheLocation).doesNotExist();
}