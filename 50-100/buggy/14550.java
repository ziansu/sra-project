@org.junit.Test
public void test_get_cache_location() throws java.lang.Exception {
    java.io.File tempFolder = temp.newFolder();
    org.mockito.Mockito.when(serverFileSystem.getTempDir()).thenReturn(tempFolder);
    org.assertj.core.api.Assertions.assertThat(dryRunCache.getCacheLocation(null)).isEqualTo(new java.io.File(new java.io.File(tempFolder, "dryRun"), "default"));
    org.assertj.core.api.Assertions.assertThat(dryRunCache.getCacheLocation(123L)).isEqualTo(new java.io.File(new java.io.File(tempFolder, "dryRun"), "123"));
}