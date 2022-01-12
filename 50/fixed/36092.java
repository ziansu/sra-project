@java.lang.Override
public void close() throws java.io.IOException {
    if ((input) != null)
        input.close();
    
    memCache.release(buffer);
    input = null;
}