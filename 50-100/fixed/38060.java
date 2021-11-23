@org.junit.Test
public void getAllocateLengthNewImplementationRandomTest() throws java.lang.Exception {
    java.util.Random random = new java.util.Random();
    for (int i = 0; i < 100000000; i++) {
        int length = java.lang.Math.abs(random.nextInt());
        testSample(length);
    }
}