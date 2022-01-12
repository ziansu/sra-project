public java.lang.Iterable<java.lang.String> certificateOfElimination(java.lang.String team) {
    if ((teams.get(team)) == null)
        throw new java.lang.IllegalArgumentException("Team does not exist");
    
    if (trivialElimination(team))
        return trivialEliminationCertificate(team);
    else
        if (nonTrivialElimination(team))
            return nontrivialEliminationCertificate(team);
        else {
            return null;
        }
    
}