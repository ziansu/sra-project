public static boolean memberHasPermission(net.dv8tion.jda.core.entities.Member member, io.ph.bot.model.Permission permission) {
    if (((permission.getJdaPerm()) == null) && (member.getUser().getId().equals(io.ph.bot.Bot.getInstance().getConfig().getBotOwnerId()))) {
        return true;
    }
    if ((member.isOwner()) || (member.hasPermission(permission.getJdaPerm())))
        return true;
    
    return false;
}