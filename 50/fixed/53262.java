@java.lang.Override
public victorious_secret.Testing_stubs.MapLocation[] getInitialArchonLocations(victorious_secret.Testing_stubs.Team team) {
    if (team == (this.team)) {
        return initialFriendlyArchonsLoc;
    }else {
        return initialEnemyArchonsLoc;
    }
}