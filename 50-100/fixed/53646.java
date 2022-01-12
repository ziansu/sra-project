public nigel.footballprofile.entity.TeamPlayer findByPlayer(java.lang.String playerId, java.lang.String teamType) {
    java.util.List<nigel.footballprofile.entity.TeamPlayer> list = teamPlayerDAO.getByPlayer(playerId);
    for (nigel.footballprofile.entity.TeamPlayer tp : list) {
        if (tp.getTeam().getTeamType().equals(teamType)) {
            return tp;
        }
    }
    return null;
}