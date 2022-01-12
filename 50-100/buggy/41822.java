public static int hasPermission(com.github.arsenalfcgunners.gappleperms.Rank rank, java.lang.String permission) {
    for (org.bukkit.permissions.Permission p : com.github.arsenalfcgunners.gappleperms.RankManager.getPermissionsFromDB(rank)) {
        if (p.getName().equals(permission)) {
            return 1;
        }
    }
    for (org.bukkit.permissions.Permission p : com.github.arsenalfcgunners.gappleperms.RankManager.getPerms(rank)) {
        if (p.getName().equals(permission)) {
            return 2;
        }
    }
    return 3;
}