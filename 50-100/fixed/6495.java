private java.util.List<GameComponents.Riddle> getUserRiddlesToSolveTeam(GameComponents.User i_User) {
    java.util.List<GameComponents.Riddle> riddlesToSolve = new java.util.ArrayList<>();
    GameComponents.Team playerTeam = getPlayerTeam(i_User);
    if (!(playerTeam.HasTeamWon(m_Levels.get(((m_Levels.size()) - 1))))) {
        return m_Levels.get(getTeamRiddleLevel(playerTeam.GetTeamName())).GetRiddlesNotSolvedByTeam(playerTeam);
    }
    return riddlesToSolve;
}