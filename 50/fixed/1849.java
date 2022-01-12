@java.lang.Override
public boolean canKill(CrandallGridWorld.TeamBug bugToKill) {
    if (bugToKill instanceof CrandallGridWorld.Geek.GeekAssassinBug)
        return false;
    
    if (sameTeam(bugToKill))
        return false;
    else
        return true;
    
}