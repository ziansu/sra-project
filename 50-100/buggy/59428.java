private void log(java.lang.String message, java.lang.String level, java.io.PrintStream ps) {
    java.lang.StringBuilder builder = new java.lang.StringBuilder();
    builder.append(getPrefix(level));
    builder.append(message);
    java.lang.String ts = builder.toString();
    ps.println(ts);
    jaci.openrio.toast.lib.log.Logger.backlog.add(ts);
    for (jaci.openrio.toast.lib.log.LogHandler hand : jaci.openrio.toast.lib.log.Logger.handlers)
        hand.onLog(message, level);
    
}