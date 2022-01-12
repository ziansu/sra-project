public void removeRole(sx.blah.discord.handle.impl.obj.IRole role, sx.blah.discord.handle.impl.obj.IGuild guild) throws sx.blah.discord.util.DiscordException, sx.blah.discord.util.MissingPermissionsException, sx.blah.discord.util.RateLimitException {
    java.util.List<sx.blah.discord.handle.impl.obj.IRole> roleList = this.getRolesForGuild(guild);
    roleList.remove(role);
    try {
        guild.editUserRoles(this, roleList.toArray(new sx.blah.discord.handle.impl.obj.IRole[roleList.size()]));
    } catch (sx.blah.discord.util.MissingPermissionsException | sx.blah.discord.util.DiscordException | sx.blah.discord.util.RateLimitException e) {
        e.printStackTrace();
    }
}