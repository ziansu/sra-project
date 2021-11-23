public static boolean isGameRunning(java.lang.String game) {
    int i = 0;
    int imax = org.kwstudios.play.ragemode.gameLogic.PlayerList.runningGames.length;
    while (i < imax) {
        if ((org.kwstudios.play.ragemode.gameLogic.PlayerList.runningGames[i]) != null) {
            if (org.kwstudios.play.ragemode.gameLogic.PlayerList.runningGames[i].equals(game)) {
                return true;
            }
        }
        i++;
    } 
    return false;
}