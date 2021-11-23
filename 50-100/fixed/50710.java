public boolean managmentCommand(java.lang.String cmd) {
    try {
        if (((mSocket) != null) && ((mSocket.getOutputStream()) != null)) {
            mSocket.getOutputStream().write(cmd.getBytes());
            mSocket.getOutputStream().flush();
            return true;
        }
    } catch (java.io.IOException e) {
    }
    return false;
}