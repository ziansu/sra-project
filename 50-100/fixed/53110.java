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
    }else {
        myAgentConcrete.doDelete();
    }
}