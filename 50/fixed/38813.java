@java.lang.Override
public void terminateWrites() throws java.io.IOException {
    if ((deflater) != null) {
        deflater.finish();
    }
    state |= io.undertow.conduits.DeflatingStreamSinkConduit.SHUTDOWN;
}