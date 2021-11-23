@Annotations.CommandAnnotation(name = "AddRole", description = "Adds role to list of Cosmetic roles that can be selected.", usage = "[Role Name]", type = Constants.TYPE_ADMIN, perms = { Permissions.MANAGE_ROLES }, requiresArgs = true, doAdminLogging = true)
public java.lang.String addRole() {
    java.lang.String roleID = Handlers.Utility.getRoleIDFromName(args, guild);
    if (roleID == null) {
        return Constants.ERROR_ROLE_NOT_FOUND;
    }else {
        return guildConfig.addRole(roleID, guild.getRoleByID(roleID).getName(), true);
    }
}