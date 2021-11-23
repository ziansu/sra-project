@java.lang.Override
public boolean done() {
    if ((counterOfHistorianRequests) >= (NUMBER_OF_TREND_CHECKS)) {
        senderFinished = true;
        return true;
    }else
        return false;
    
}