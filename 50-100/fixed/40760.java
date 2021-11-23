public void setOfferingList(final int startType) {
    if ((startType == (org.openRealmOfStars.game.States.DiplomacyView.AI_REGULAR)) || (startType == (org.openRealmOfStars.game.States.DiplomacyView.AI_BORDER_CROSS))) {
        setHumanOfferingList(trade.getFirstOffer());
        setAiOfferingList(trade.getSecondOffer());
    }else {
        setHumanOfferingList(trade.getSecondOffer());
        setAiOfferingList(trade.getFirstOffer());
    }
}