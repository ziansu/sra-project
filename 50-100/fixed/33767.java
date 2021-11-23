@java.lang.Override
public void call(java.lang.Object... objects) {
    socket.emit("echo", false);
    socket.on("echoBack", new io.socket.emitter.Emitter.Listener() {
        @java.lang.Override
        public void call(java.lang.Object... args) {
            values.offer(args[0]);
        }
    });
}