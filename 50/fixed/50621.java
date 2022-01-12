public static void addPermission(com.github.arsenalfcgunners.gappleperms.Rank rank, java.lang.String permission) {
    java.util.List<java.lang.String> perms = com.github.arsenalfcgunners.gappleperms.RankManager.getPermissionsFromDB(rank);
    perms.add(permission);
    com.github.arsenalfcgunners.gappleperms.RankManager.setPermissions(rank, perms);
}