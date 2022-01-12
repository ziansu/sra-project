public static synchronized int hasPermission(com.github.arsenalfcgunners.gappleperms.Rank rank, java.lang.String permission) {
    for (java.lang.String p : com.github.arsenalfcgunners.gappleperms.RankManager.getPermissionsFromDB(rank)) {
        if (p.equals(permission)) {
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