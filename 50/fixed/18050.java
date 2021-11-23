@java.lang.Override
public boolean hasNext() {
    if (succ()) {
        hasNextCalled = true;
        return true;
    }
    return false;
}