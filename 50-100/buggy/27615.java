public static com.ibm.si.jaql.api.IArielDatabase getArielDatabase(final java.lang.String ip, final java.lang.String user, final java.lang.String password, final int port) throws com.ibm.si.jaql.api.ArielException {
    com.ibm.si.jaql.api.IArielDatabase result = com.ibm.si.jaql.api.ArielFactory.dbCache.get(ip);
    if (result == null) {
        java.lang.System.out.println(("getArielDatabase: " + ip));
        result = new com.ibm.si.jaql.rest.ArielDatabase(ip, user, password, port);
        com.ibm.si.jaql.api.ArielFactory.dbCache.put(ip, result);
    }
    return result;
}