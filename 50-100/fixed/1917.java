public static java.util.ArrayList<org.bukkit.permissions.Permission> getPerms(com.github.arsenalfcgunners.gappleperms.Rank rank) {
    java.util.ArrayList<org.bukkit.permissions.Permission> perms = new java.util.ArrayList<org.bukkit.permissions.Permission>();
    for (com.github.arsenalfcgunners.gappleperms.Rank r : com.github.arsenalfcgunners.gappleperms.RankManager.ranks) {
        if ((r.getLevel()) <= (rank.getLevel())) {
            for (java.lang.String p : com.github.arsenalfcgunners.gappleperms.RankManager.getPermissionsFromDB(r)) {
                perms.add(new org.bukkit.permissions.Permission(p));
            }
        }
    }
    return perms;
}