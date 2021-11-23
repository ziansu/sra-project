public void setTeam(java.util.ArrayList<libraryClasses.Player> team) {
    if (team != null) {
        if ((team.size()) <= 30) {
            this.team = team;
            if ((team.size()) == 30) {
                isMax = true;
            }else {
                isMax = false;
            }
        }
    }else {
        this.team = null;
    }
}