@org.junit.Test
public void start() throws java.lang.Exception {
    new com.seveniu.DataQueue("a").start();
    java.util.concurrent.TimeUnit.SECONDS.sleep(100);
}