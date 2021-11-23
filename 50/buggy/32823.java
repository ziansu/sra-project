public void setTeam(java.lang.String teamName) {
    for (com.thoughtworks.entities.util.Team t : com.thoughtworks.entities.util.Team.values()) {
        if (t.getName().equals(teamName))
            this.team = t;
        
    }
}