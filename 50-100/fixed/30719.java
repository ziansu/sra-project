public void updateTimeout(org.araqne.logdb.cep.EventContext ctx) {
    if (slog.isDebugEnabled()) {
        java.text.SimpleDateFormat df = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        slog.debug("araqne logdb cep: update timeout [{}] of context [{}]", df.format(new java.util.Date(ctx.getTimeoutTime())), ctx.getKey());
    }
}