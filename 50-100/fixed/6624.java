private synchronized be.olsson.slackappender.SlackAppender.MessageStat getMessageStat(org.apache.log4j.spi.LoggingEvent event) {
    if (meltdownProtection) {
        java.lang.String key = event.getMessage().toString();
        be.olsson.slackappender.SlackAppender.MessageStat stat = similar.get(key);
        if (stat == null) {
            stat = new be.olsson.slackappender.SlackAppender.MessageStat();
            stat.lastLogged = java.lang.System.currentTimeMillis();
        }
        similar.put(key, stat);
        (stat.countSinceLastLog)++;
        stat.lastSeen = java.lang.System.currentTimeMillis();
        return stat;
    }
    return null;
}