@java.lang.Override
public void onStart() {
    senderFinished = false;
    receiverFinished = false;
    orderToSend = null;
    checkedTrends.clear();
    cfpMessage = ((jade.lang.acl.ACLMessage) (this.getDataStore().get(parentBehaviour.CFP_KEY)));
    traderConditionsFulfilled = myAgentConcrete.checkSelfState();
    if (!(traderConditionsFulfilled)) {
        myAgentConcrete.setTradingStatus(true);
        java.lang.System.out.println("Starting...");
    }else {
        myAgentConcrete.doDelete();
    }
}