public void addRole(sx.blah.discord.handle.impl.obj.IRole role, sx.blah.discord.handle.impl.obj.IGuild guild) throws sx.blah.discord.util.DiscordException, sx.blah.discord.util.MissingPermissionsException, sx.blah.discord.util.RateLimitException {
    java.util.List<sx.blah.discord.handle.impl.obj.IRole> roleList = this.getRolesForGuild(guild);
    roleList.add(role);
    guild.editUserRoles(this, roleList.toArray(new sx.blah.discord.handle.impl.obj.IRole[roleList.size()]));
}