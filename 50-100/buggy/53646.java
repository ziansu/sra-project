public nigel.footballprofile.entity.TeamPlayer findByPlayer(java.lang.String playerId, java.lang.String teamType) {
    for (nigel.footballprofile.entity.TeamPlayer tp : teamPlayerDAO.getByPlayer(playerId)) {
        if (tp.getTeam().getTeamType().equals(teamType)) {
            return tp;
        }
    }
    return null;
}