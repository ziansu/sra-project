private void logout() {
    if (!(connected)) {
        return ;
    }
    connected = false;
    try {
        if ((sock) != null) {
            sock.close();
        }
    } catch (java.io.IOException e) {
        java.lang.System.err.println("SOME PROBLEM OCCURS !!!");
    }
}