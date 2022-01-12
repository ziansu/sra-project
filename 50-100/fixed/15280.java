public static boolean hasRole(sx.blah.discord.handle.obj.IUser user, sx.blah.discord.api.IDiscordClient bot, java.lang.String roleName) {
    boolean result = false;
    if (roleName != null) {
        for (sx.blah.discord.handle.obj.IRole role : user.getRolesForGuild(bot.getGuildByID(Karren.conf.getGuildId()))) {
            if (role.getName().equals(roleName)) {
                result = true;
            }
        }
    }else {
        result = true;
    }
    return result;
}