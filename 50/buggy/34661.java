public void connectToDevice() {
    shareSessionKey();
    initTimestamp();
    java.lang.System.out.println(("TimeRef: " + (timeRef)));
    shareIV();
    authenticate();
}