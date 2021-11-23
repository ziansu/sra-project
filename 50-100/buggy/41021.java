public static void delPermission(com.github.arsenalfcgunners.gappleperms.Rank rank, java.lang.String permission) {
    java.util.ArrayList<org.bukkit.permissions.Permission> perms = com.github.arsenalfcgunners.gappleperms.RankManager.getPermissionsFromDB(rank);
    for (int i = (perms.size()) - 1; i >= 0; i--) {
        if (perms.get(i).getName().equals(permission)) {
            perms.remove(i);
        }
    }
    com.github.arsenalfcgunners.gappleperms.RankManager.setPermissions(rank, perms);
}