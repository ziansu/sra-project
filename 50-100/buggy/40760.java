public void setOfferingList(final int startType) {
    if ((startType == (org.openRealmOfStars.game.States.DiplomacyView.AI_REGULAR)) || (startType == (org.openRealmOfStars.game.States.DiplomacyView.AI_BORDER_CROSS))) {
        setAiOfferingList(trade.getFirstOffer());
        setHumanOfferingList(trade.getSecondOffer());
    }else {
        setAiOfferingList(trade.getSecondOffer());
        setHumanOfferingList(trade.getFirstOffer());
    }
}