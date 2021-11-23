public static int playerSearch(java.util.ArrayList<com.company.Player> players, java.lang.String username) {
    for (int x = 0; x < (players.size()); x++) {
        if (username == (players.get(x).getName())) {
            return x;
        }
    }
    return -1;
}