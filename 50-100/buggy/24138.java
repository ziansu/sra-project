public GameComponents.Riddle GetUserRiddleById(java.lang.Integer i_Id, GameComponents.User i_User) {
    GameComponents.Team team = getPlayerTeam(i_User);
    if (m_IsTeamGame) {
        return m_Levels.get(team.GetTeamRiddleLevel()).GetRiddleById(i_Id);
    }
    return m_Levels.get(team.GetPlayerRiddleLevel(i_User)).GetRiddleById(i_Id);
}