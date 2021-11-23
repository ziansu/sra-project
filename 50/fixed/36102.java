private boolean userCheck(java.lang.String username) {
    pattern = java.util.regex.Pattern.compile(com.twitchbotx.bot.ModerationHandler.BANNED_USERNAME);
    matcher = pattern.matcher(username);
    return matcher.matches();
}