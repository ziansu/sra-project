@java.lang.Override
public com.codete.codeball.model.TeamAssignment assignTeams(java.util.List<com.codete.codeball.model.User> players) {
    java.util.List<com.codete.codeball.model.User> playersToAssign = com.google.common.collect.Lists.newArrayList(players);
    int teamSize = (players.size()) / 2;
    java.util.Collections.shuffle(playersToAssign);
    return new com.codete.codeball.model.TeamAssignment(playersToAssign.subList(0, teamSize), playersToAssign.subList(teamSize, playersToAssign.size()));
}