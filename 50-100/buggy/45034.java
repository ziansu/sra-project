@org.junit.Test
public void testContainerLoadsAppropriateFileSystems() {
    final org.springframework.context.ApplicationContext ctx = new org.springframework.context.support.ClassPathXmlApplicationContext(new java.lang.String[]{ com.tasco.hls.HlsAnalyzer.CONTAINER });
    org.junit.Assert.assertTrue(FileAccessor.FILESYSTEMS.containsKey("http"));
    org.junit.Assert.assertTrue(FileAccessor.FILESYSTEMS.containsKey("https"));
    org.junit.Assert.assertTrue(FileAccessor.FILESYSTEMS.containsKey("classpath"));
    org.junit.Assert.assertTrue(FileAccessor.FILESYSTEMS.containsKey("file"));
}