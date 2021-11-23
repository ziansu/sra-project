@java.lang.Override
public boolean hasMore() throws java.io.IOException {
    return ((offset) + (position)) < (length);
}