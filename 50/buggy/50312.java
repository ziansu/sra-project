@java.lang.Override
public boolean hasNext() {
    if (isClosed()) {
        return false;
    }
    if ((object) == null) {
        object = fetchNextUsingRowBound();
    }
    return (object) != null;
}