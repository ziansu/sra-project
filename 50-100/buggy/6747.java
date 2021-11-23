@main.com.valkryst.VcLSM.benchmarks.AfterClass
public static void stopBenchmark() {
    try {
        main.com.valkryst.VcLSM.benchmarks.TweetsDictBenchmarks.keyArr.clear();
        org.apache.commons.io.FileUtils.deleteDirectory(new java.io.File("data/"));
        org.apache.commons.io.FileUtils.deleteDirectory(new java.io.File("levelDB/"));
        main.com.valkryst.VcLSM.benchmarks.TweetsDictBenchmarks.db.close();
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}