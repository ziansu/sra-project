@org.openjdk.jmh.annotations.Setup(value = org.openjdk.jmh.annotations.Level.Trial)
public void setup() throws io.netty.handler.codec.http2.Http2Exception {
    connection = new io.netty.handler.codec.http2.DefaultHttp2Connection(false);
    for (int i = 0; i < (numStreams); ++i) {
        connection.local().createStream(io.netty.microbench.http2.Http2PriorityTreeBenchmark.toStreamId(i), false);
    }
}