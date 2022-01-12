public boolean TeamSolvedRiddle(GameComponents.Level i_NextLevel, GameComponents.Riddle i_Riddle) {
    boolean teamHasWon = false;
    if (m_UnsolvedTeamRiddles.isEmpty()) {
        m_UnsolvedTeamRiddles = m_TeamRiddleLevel.GetRiddlesNotSolvedByTeam(this);
    }
    if (m_UnsolvedTeamRiddles.contains(i_Riddle)) {
        m_UnsolvedTeamRiddles.remove(i_Riddle);
    }
    if (m_UnsolvedTeamRiddles.isEmpty()) {
        m_TeamRiddleLevel = i_NextLevel;
        teamHasWon = i_NextLevel == null;
        if (!teamHasWon) {
            m_UnsolvedTeamRiddles = m_TeamRiddleLevel.GetRiddlesNotSolvedByTeam(this);
        }
    }
    return teamHasWon;
}