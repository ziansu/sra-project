private void sendCMDToServer(java.lang.String cmd) {
    out.println((cmd + "\n"));
    out.flush();
}