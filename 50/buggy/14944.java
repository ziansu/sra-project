@java.lang.Override
public int testCount() {
    int size = computeTestMethods().size();
    com.github.radm.TheorySuite.LOG.info("Executing {} tests", size);
    return size;
}