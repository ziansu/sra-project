public synchronized java.util.List<java.util.Map<java.lang.String, java.lang.String>> execute(java.lang.String cmd) throws me.legrange.mikrotik.MikrotikApiException {
    if (((conn) == null) || (!(conn.isConnected()))) {
        connect();
    }
    java.lang.System.out.println(("Executing " + cmd));
    return conn.execute(cmd);
}