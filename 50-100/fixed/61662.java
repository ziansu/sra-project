private static void createTeam() {
    if ((LeagueManager.teams.size()) < (LeagueManager.players.length)) {
        LeagueManager.prompt.printTitle("Create a team");
        java.lang.String teamName = LeagueManager.prompt.getLine("Team name");
        java.lang.String coach = LeagueManager.prompt.getLine("Coach");
        com.teamtreehouse.model.Team team = new com.teamtreehouse.model.Team(teamName, coach);
        LeagueManager.teams.add(team);
    }else {
        java.lang.System.out.println("Sorry, you can't create any more teams.");
    }
}