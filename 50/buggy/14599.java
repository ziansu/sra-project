public static final boolean isClassExists(java.lang.String className) {
    try {
        java.lang.Class.forName(className);
        return true;
    } catch (java.lang.ClassNotFoundException cnfe) {
        throw new org.productivity.java.syslog4j.SyslogRuntimeException(cnfe);
    }
}