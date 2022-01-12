public void addStudentWithId(int id) {
    for (edu.virginia.bookmark.Team team : teams) {
        if (team.containsStudentWithId(id)) {
            java.lang.System.out.println(("Adding a Student From Team " + (team.getName())));
            activeTurnTeamId = team.id;
            clearUpToDateStatus();
            return ;
        }
    }
}