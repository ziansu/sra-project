public static java.lang.String generateStatistics(boolean skipZero, boolean detailed) {
    java.lang.StringBuilder statOutput = new java.lang.StringBuilder("Statistics:\n");
    for (com.omertron.slackbot.model.StatHolder stat : com.omertron.slackbot.stats.BotStatistics.STATISTICS.values()) {
        int value = stat.getTotal();
        if ((value > 0) || (!skipZero)) {
            statOutput.append(stat.formatOutput(true));
        }
    }
    return statOutput.toString();
}