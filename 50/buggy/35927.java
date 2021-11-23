public static java.lang.String BotUptime() {
    java.lang.management.RuntimeMXBean botRuntime = java.lang.management.ManagementFactory.getRuntimeMXBean();
    return "Bot Uptime: " + (org.apache.commons.lang.time.DurationFormatUtils.formatDuration(botRuntime.getUptime(), "M' months' d' days' H:m:s.S"));
}