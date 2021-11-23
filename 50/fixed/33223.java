public void event(java.lang.Object session, org.productivity.java.syslog4j.server.SyslogServerIF syslogServer, java.net.SocketAddress socketAddress, org.productivity.java.syslog4j.server.SyslogServerEventIF event) {
    java.lang.String str = formatter.format(event);
    if (str != null) {
        this.stream.println(str);
    }
}