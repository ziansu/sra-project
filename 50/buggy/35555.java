public static void setLogger() {
    org.renci.ahab.libndl.LIBNDL.logger = org.apache.log4j.Logger.getLogger(org.renci.ahab.libndl.LIBNDL.class.getCanonicalName());
    org.renci.ahab.libndl.LIBNDL.logger.setLevel(org.apache.log4j.Level.DEBUG);
}