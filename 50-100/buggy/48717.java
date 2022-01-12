public void runFollowFriendlyMode() {
    while (true) {
        try {
            if ((friendlyToFollow) == null) {
                friendlyToFollow = findAFriendly();
            }
            if ((friendlyToFollow) == null) {
                walkAimlessly();
                return ;
            }else {
                battlecode.common.MapLocation friendLocation = myRC.senseLocationOf(friendlyToFollow);
                this.nav.getNextMove(friendLocation);
            }
        } catch (java.lang.Exception e) {
            java.lang.System.out.println("Exception Caught");
            e.printStackTrace();
        }
    } 
}