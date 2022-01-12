protected sun.nio.cs.StreamDecoder getDecoder() throws java.io.IOException {
    if ((decoder) == null) {
        initDecoder((-1));
    }
    return decoder;
}