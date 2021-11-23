@java.lang.Override
public void clearAuction() {
    for (int i = 0; i < (bids.length); i++) {
        if ((bids[i]) > 0) {
            bountyState.getAgents()[i].receiveResource(res);
            bids[i] = 0;
        }
    }
}