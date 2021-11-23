public void emit(java.lang.String name, java.lang.Object data) {
    android.util.Log.d(name, ((("TIMESTAMP:" + (new java.util.Date().getTime())) + ", data: ") + data));
    socket.emit("padEvent", data);
}