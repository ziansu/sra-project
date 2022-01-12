private void inboundConnectionReceived(java.util.UUID uuid, java.nio.channels.AsynchronousSocketChannel socket) {
    java.lang.System.out.println(("inbound received " + uuid));
    mini.relay.Pipe pipe;
    if (!(pipeMap.PipeExists(uuid))) {
        pipe = new mini.relay.Pipe(uuid, this);
        pipeMap.map.put(uuid, pipe);
        this.connectMajorSocket(pipe);
    }
    pipe = pipeMap.map.get(uuid);
    pipe.setInbound(socket);
    pipe.setInboundReady();
}