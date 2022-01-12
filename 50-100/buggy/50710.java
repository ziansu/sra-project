public void managmentCommand(java.lang.String cmd) {
    try {
        if (((mSocket) != null) && ((mSocket.getOutputStream()) != null)) {
            mSocket.getOutputStream().write(cmd.getBytes());
            mSocket.getOutputStream().flush();
        }
    } catch (java.io.IOException e) {
    }
}