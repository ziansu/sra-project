@org.junit.Test
public void makeTest() throws java.lang.Exception {
    performTest(hashMapFactory.synchronizeed(), true);
    performTest(hashMapFactory.globalLock(), true);
}