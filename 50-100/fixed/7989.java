@java.lang.Override
public void run() {
    try (java.io.OutputStream obuf = java.nio.channels.Channels.newOutputStream(pipe.sink())) {
        t.transform(source, new javax.xml.transform.stream.StreamResult(obuf));
        obuf.flush();
    } catch (java.lang.Exception ex) {
        ex.printStackTrace();
    }
}