private boolean trivialElimination(java.lang.String team) {
    assert team != null;
    short index = teams.get(team);
    for (int i = 0; i < (teams.size()); i++) {
        if ((i != index) && ((w[i]) > ((w[index]) + (r[index]))))
            return true;
        
    }
    return false;
}