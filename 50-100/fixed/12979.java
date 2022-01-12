@java.lang.Override
public boolean equals(java.lang.Object other) {
    if (other == null)
        return false;
    
    if (!(other instanceof model.Team))
        return false;
    
    model.Team team = ((model.Team) (other));
    if (team.name.equals(this.name))
        return true;
    
    return false;
}