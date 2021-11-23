@org.junit.After
public void tearDown() throws java.lang.Exception {
    kafkaServer.shutdown();
    zkClient.close();
    zkServer.shutdown();
}