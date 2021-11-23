@java.lang.Override
public boolean canBeKilled(CrandallGridWorld.TeamBug byWhom) {
    if (!(sameTeam(byWhom))) {
        return true;
    }
    return false;
}