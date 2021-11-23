@org.junit.Test
public void test() throws java.lang.Exception {
    try {
        eu.amidst.tutorial.usingAmidst.examples.ParallelTANExample.main(null);
    } catch (java.lang.UnsatisfiedLinkError error) {
        error.printStackTrace();
    }
}