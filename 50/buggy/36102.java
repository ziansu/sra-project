private boolean userCheck(java.lang.String username) {
    pattern = java.util.regex.Pattern.compile(com.twitchbotx.bot.ModerationHandler.BANNED_USERNAME);
    matcher = pattern.matcher(username);
    java.lang.System.out.println(matcher.matches());
    java.lang.System.out.println(username);
    return matcher.matches();
}