@org.junit.Test
public void getAllocateLengthNewImplementationRandomTest() throws java.lang.Exception {
    java.util.Random random = java.util.concurrent.ThreadLocalRandom.current();
    for (int i = 0; i < 100000000; i++) {
        int length = java.lang.Math.abs(random.nextInt());
        testSample(length);
    }
}