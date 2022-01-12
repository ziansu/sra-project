private void setTeams() {
    for (Model.Player p : players) {
        if ((p.isPlayer()) && (askPlayerToPickUp(p))) {
            scoreboard.setPicker(p);
            return ;
        }else
            if ((!(p.isNonAIPlayer())) && (p.chooseToPickUp())) {
                scoreboard.setPicker(p);
                return ;
            }
        
    }
    if (printAll)
        java.lang.System.out.println("Blind not picked up: Leaster will be played!!");
    
    scoreboard.setLeaster();
    table.setLeaster();
}