@org.junit.Test
public void testIrisDataFetcher() throws java.lang.Exception {
    org.deeplearning4j.base.MnistFetcher mnistFetcher = new org.deeplearning4j.base.MnistFetcher();
    org.deeplearning4j.base.File mnistDir = mnistFetcher.downloadAndUntar();
    assert mnistDir.isDirectory();
}