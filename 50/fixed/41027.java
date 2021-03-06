@java.lang.Override
public void changedConnection(core.Connection con) {
    super.changedConnection(con);
    if (con.isUp()) {
        core.DTNHost otherHost = con.getOtherNode(getHost());
        updateReachFor(otherHost);
        updateTransitiveReach(otherHost);
    }
}