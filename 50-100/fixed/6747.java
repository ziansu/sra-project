@org.junit.AfterClass
public static void stopBenchmark() {
    try {
        main.com.valkryst.VcLSM.benchmarks.TweetsDictBenchmarks.keyArr.clear();
        main.com.valkryst.VcLSM.benchmarks.TweetsDictBenchmarks.db.close();
        org.apache.commons.io.FileUtils.deleteDirectory(new java.io.File("data/"));
        org.apache.commons.io.FileUtils.deleteDirectory(new java.io.File("levelDB/"));
    } catch (final java.io.IOException e) {
        e.printStackTrace();
    }
}