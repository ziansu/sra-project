@java.lang.Override
public boolean hasNext() {
    hasNextCalled = true;
    return succ();
}