public static boolean setGameNotRunning(java.lang.String game) {
    if (!(org.kwstudios.play.ragemode.toolbox.GetGames.isGameExistent(game, org.kwstudios.play.ragemode.gameLogic.PlayerList.fileConfiguration)))
        return false;
    
    int i = 0;
    int imax = org.kwstudios.play.ragemode.gameLogic.PlayerList.runningGames.length;
    while (i < imax) {
        if ((org.kwstudios.play.ragemode.gameLogic.PlayerList.runningGames[i]) != null) {
            if (org.kwstudios.play.ragemode.gameLogic.PlayerList.runningGames[i].equals(game)) {
                org.kwstudios.play.ragemode.gameLogic.PlayerList.runningGames[i] = null;
                return true;
            }
        }
        i++;
    } 
    return false;
}