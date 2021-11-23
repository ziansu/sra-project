public static void deleteTeam(net.acampadas21.teamapi.groups.Team t) {
    if (net.acampadas21.teamapi.TeamManager.isTeam(t.getName())) {
        net.acampadas21.teamapi.TeamManager.db.standardQuery((("DELETE TABLE " + (t.getName())) + ";"));
    }
}