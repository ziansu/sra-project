public void addStudentWithId(int id) {
    for (edu.virginia.bookmark.Team team : teams) {
        if (team.containsStudentWithId(id)) {
            java.lang.System.out.println(("Adding a Student From Team " + (team.getName())));
            if ((activeTurnTeamId) < 0) {
                activeTurnTeamId = team.id;
            }
            clearUpToDateStatus();
            return ;
        }
    }
}