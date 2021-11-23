private void emit(braincode.mobile.ebox.gesture.GestureEvent gestureEvent) {
    java.lang.Object data = gestureEvent.getData();
    android.util.Log.d("padEvent", ((("TIMESTAMP:" + (new java.util.Date().getTime())) + ", data: ") + data));
    socket.emit("padEvent", data);
}