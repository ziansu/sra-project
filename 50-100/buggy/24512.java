public boolean readCard(ua.kpi.cards.ICard card) {
    try {
        checkCardInSystem(card);
        checkType(card);
        checkExpiredDate(card);
        checkNrTrips(card);
        card.notifyPass();
        addAcceptedPasses();
    } catch (java.lang.Exception e) {
        e.getMessage();
        java.lang.System.out.println("Access Denied");
        addRejectedPasses();
        return false;
    }
    return true;
}