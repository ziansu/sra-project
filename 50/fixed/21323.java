public void managmentCommand(java.lang.String cmd) {
    try {
        mSocket.getOutputStream().write(cmd.getBytes());
        mSocket.getOutputStream().flush();
    } catch (java.io.IOException e) {
    }
}