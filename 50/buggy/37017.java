public void getDataForUser() {
    this.mSocket.emit("getTodo", 2);
    this.mSocket.emit("getApp", 2);
}