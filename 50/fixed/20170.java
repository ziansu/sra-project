public void requestWhiteCard() {
    if ((cardQuota) > 0) {
        service.requestWhiteCard();
        (cardQuota)--;
    }else
        observer.notifyError("You can't draw any more cards.");
    
}