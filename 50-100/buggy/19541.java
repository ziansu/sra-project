private void playMatch(com.itd.football_example.FootballTeam team1, com.itd.football_example.FootballTeam team2) {
    com.itd.football_example.Match match = new com.itd.football_example.Match(team1, team2, allocateGoals(team1.getSkill(), team2.getSkill()), allocateGoals(team2.getSkill(), team2.getSkill()));
    if ((match.getWinner()) == null) {
        playMatch(team1, team2);
    }else {
        matches.add(match);
    }
}