public static boolean isUserAdmin(net.dv8tion.jda.core.entities.User user) {
    if (com.xelitexirish.elitedeveloperbot.UserPrivs.adminUsers.contains(user)) {
        return true;
    }else {
        for (net.dv8tion.jda.core.entities.Role role : user.getJDA().getGuildById(Constants.DISCORD_SERVER_ID).getMember(user).getRoles()) {
            if (role.getId().equalsIgnoreCase(Constants.ROLE_ADMIN_ID)) {
                return true;
            }
        }
    }
    return false;
}