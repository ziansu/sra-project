@java.lang.Override
public void close(final boolean fileOnly) throws java.io.IOException {
    super.close(fileOnly);
    if (!fileOnly)
        keyValPairs = new java.util.HashMap<>();
    
}