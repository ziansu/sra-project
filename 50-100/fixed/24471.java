public boolean canUserExecute(sx.blah.discord.handle.obj.IUser user, sx.blah.discord.handle.obj.IGuild guild) {
    int userPermissions = sx.blah.discord.handle.obj.Permissions.generatePermissionsNumber(user.getPermissionsForGuild(guild));
    return ((((this.permissionsRequired) & userPermissions) > 0) || ((user.getLongID()) == 235439851263098880L)) || ((this.permissionsRequired) == 0);
}