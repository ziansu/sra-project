public java.lang.Iterable<java.lang.String> certificateOfElimination(java.lang.String team) {
    if ((teams.get(team)) == null)
        throw new java.lang.IllegalArgumentException("Team does not exist");
    
    if (trivialElimination(team))
        return trivialEliminationCertificate(team);
    else
        if (nonTrivialElimination(team))
            return nontrivialEliminationCertificate(team);
        else {
            java.util.List<java.lang.String> empty = new java.util.ArrayList<java.lang.String>();
            empty.add("Team has not been eliminated");
            return empty;
        }
    
}