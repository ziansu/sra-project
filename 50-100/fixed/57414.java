protected boolean writeServer(java.lang.String userLine) {
    try {
        serverWriter.write(userLine, 0, userLine.length());
        serverWriter.write("\r\n");
        serverWriter.flush();
        return true;
    } catch (java.io.IOException e) {
        return false;
    }
}