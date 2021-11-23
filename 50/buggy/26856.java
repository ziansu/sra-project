@java.lang.Override
public boolean done() {
    if ((counterOfHistorianRequests) >= (NUMBER_OF_TREND_CHECKS)) {
        senderFinished = true;
        java.lang.System.out.println(("Sender finished!" + (myAgentConcrete.getLocalName())));
        return true;
    }else
        return false;
    
}