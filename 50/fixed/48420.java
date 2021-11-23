public boolean sendMessage(byte message) {
    try {
        if ((out) != null) {
            out.write(message);
            out.flush();
        }
    } catch (java.io.IOException e) {
        return false;
    }
    return true;
}