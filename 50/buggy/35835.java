public Team getTeam(int id) {
    for (Team t : teams) {
        if ((t.getId()) == id) {
            return t;
        }
    }
    return null;
}