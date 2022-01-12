@java.lang.SuppressWarnings(value = "resource")
@org.junit.Test
public void testContainerLoadsAppropriateFileSystems() {
    new org.springframework.context.support.ClassPathXmlApplicationContext(new java.lang.String[]{ com.tasco.hls.HlsAnalyzer.CONTAINER });
    org.junit.Assert.assertTrue(FileAccessor.FILESYSTEMS.containsKey("http"));
    org.junit.Assert.assertTrue(FileAccessor.FILESYSTEMS.containsKey("https"));
    org.junit.Assert.assertTrue(FileAccessor.FILESYSTEMS.containsKey("classpath"));
    org.junit.Assert.assertTrue(FileAccessor.FILESYSTEMS.containsKey("file"));
}