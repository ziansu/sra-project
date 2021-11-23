private java.util.List<GameComponents.Riddle> getUserRiddlesToSolveIndividual(GameComponents.User i_User) {
    java.util.List<GameComponents.Riddle> riddlesToSolve = new java.util.ArrayList<>();
    GameComponents.Team playerTeam = getPlayerTeam(i_User);
    if (!(playerTeam.HasPlayerWon(i_User))) {
        java.lang.Integer riddleLevel = playerTeam.GetPlayerRiddleLevel(i_User, false);
        return m_Levels.get(riddleLevel).GetRiddlesNotSolvedByPlayer(i_User);
    }
    return riddlesToSolve;
}