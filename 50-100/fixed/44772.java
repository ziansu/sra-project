public static int checkExist(java.lang.String username) {
    for (int i = 0; i < 100; i++) {
        NimPlayer player = Nimsys.playerlist[i];
        if (player != null) {
            if ((username.compareTo(Nimsys.playerlist[i].username)) < 0) {
                return i;
            }
        }
        if (player == null)
            return i;
        
        java.lang.String existuser = player.getUsername();
        if (existuser.equals(username))
            return i;
        
    }
    return 100;
}