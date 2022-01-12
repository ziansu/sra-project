@org.junit.Test
public void test() throws java.lang.InterruptedException {
    java.lang.Thread dbWriter = new java.lang.Thread(yhooWriter);
    java.lang.Thread urlReader = new java.lang.Thread(urlConn);
    new java.lang.Thread(new com.elitetrader.crystalball.database.influxdb.YahooDataWriter(queue, config)).start();
    urlReader.start();
    dbWriter.start();
    urlReader.join();
    dbWriter.join();
}