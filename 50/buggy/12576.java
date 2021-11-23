@java.lang.Override
public void call(java.lang.Object... args) {
    asia.junction.naruto_go.Log.d("[socket.io]", "EVENT_CONNECT");
    socket.emit("foo", "hi");
}