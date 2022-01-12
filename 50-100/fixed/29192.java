private boolean isAuthorized(java.lang.String player, java.lang.String toRank) {
    if (player == null) {
        return false;
    }
    if (player.equalsIgnoreCase("CONSOLE")) {
        return true;
    }
    java.lang.String rank = getRank(player);
    if (((rank.equalsIgnoreCase("gameadmin")) || (rank.equalsIgnoreCase("admin"))) || (rank.equalsIgnoreCase("owner"))) {
        return true;
    }
    return false;
}