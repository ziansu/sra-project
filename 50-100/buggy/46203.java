@java.lang.Override
public void update() {
    super.update();
    if (((routing.SojongRouter.warmUpEnded) == false) && ((routing.SojongRouter.isWarmUp()) == false)) {
        routing.SojongRouter.warmUpEnded = true;
        routing.SojongRouter.warmUpEnd();
    }
    if ((isTransferring()) || (!(canStartTransfer()))) {
        return ;
    }
    if ((exchangeDeliverableMessages()) != null) {
        return ;
    }
    if ((routing.SojongRouter.isWarmUp()) == true) {
        tryAllMessagesToAllConnections();
    }
}