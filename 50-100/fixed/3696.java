public void reinit() {
    for (uk.ac.lincoln.games.nlfs.logic.Team t : teams) {
        t.reinit(this);
    }
    for (uk.ac.lincoln.games.nlfs.logic.Match m : fixtures)
        m.reinit(this);
    
    for (uk.ac.lincoln.games.nlfs.logic.LeagueTableItem lti : table)
        lti.reinit(this);
    
}