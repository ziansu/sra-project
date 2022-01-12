public java.lang.String promptDestIP() {
    java.lang.String addr = this.peerSetup.showAndWait().get();
    return addr;
}