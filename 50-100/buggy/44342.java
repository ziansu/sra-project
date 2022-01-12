public static java.lang.String colorize(java.lang.String message) {
    if (message.contains("Starting ")) {
        return message;
    }else {
        java.lang.String line = hudson.plugins.ircbot.v2.IRCColorizer.colorForBuildResult(message);
        if (line == message) {
            java.util.regex.Matcher m = hudson.plugins.ircbot.v2.IRCColorizer.TEST_CLASS_PATTERN.matcher(message);
            if (m.matches()) {
                return ((org.pircbotx.Colors.BOLD) + (org.pircbotx.Colors.MAGENTA)) + line;
            }
        }
        return line;
    }
}