@java.lang.Override
public void terminateWrites() throws java.io.IOException {
    deflater.finish();
    state |= io.undertow.conduits.DeflatingStreamSinkConduit.SHUTDOWN;
}