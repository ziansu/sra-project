private void sendCommand(java.lang.String cmd) {
    out.write(me.legrange.swap.tcp.TcpTransport.COMMAND_START);
    out.write(cmd);
    out.write("\n");
    out.flush();
}