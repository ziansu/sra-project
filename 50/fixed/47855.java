private void initSocket(com.devmobile.ofait.models.Account account) {
    mSocket.emit("init_socket", account._id);
}