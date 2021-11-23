public models.users.Team getTeam() {
    models.users.Team team = new models.users.Team();
    java.util.List<models.users.Team> teams = models.users.Team.findAll();
    for (models.users.Team t : teams) {
        if ((t.getUserID()) == (userid)) {
            team = t;
            java.lang.System.out.println(t);
        }
    }
    return team;
}