@java.lang.Override
public void call(java.lang.Object... objects) {
    socket.on("echoBack", new io.socket.emitter.Emitter.Listener() {
        @java.lang.Override
        public void call(java.lang.Object... args) {
            values.offer(args[0]);
        }
    });
    for (java.lang.String data : correct) {
        socket.emit("echo", data);
    }
}