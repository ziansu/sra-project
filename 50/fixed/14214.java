public static java.lang.String sqlCreationTime(codeu.chat.util.Time userTime) {
    java.lang.Long inMs = userTime.inMs();
    java.lang.String sqlCreationTime = java.lang.Long.toString(inMs);
    return sqlCreationTime;
}