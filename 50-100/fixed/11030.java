@org.junit.Test
public void fullConfig() throws java.lang.Exception {
    dir = testDir("fullConfig");
    new com.github.zhongl.ipage.KVEngineBuilder(dir).backlog(10).initialBucketSize(256).chunkCapacity(4096).flushByCount(5).flushByElapseMilliseconds(500L).build();
}