public static void e(java.lang.String message, java.lang.Throwable t) {
    for (int i = 0; i < (io.realm.internal.log.RealmLog.LOGGERS.size()); i++) {
        io.realm.internal.log.RealmLog.LOGGERS.get(0).v(message, t);
    }
}