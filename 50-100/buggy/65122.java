public boolean hasResources(com.alvarpq.GOTF.cards.Card card) {
    if ((deck.getHand().contains(card)) && ((threshold) > (card.getThresholdCost()))) {
        java.util.List<com.alvarpq.GOTF.coreGame.Resource> tempResources = new java.util.LinkedList<com.alvarpq.GOTF.coreGame.Resource>(resources);
        for (com.alvarpq.GOTF.coreGame.Resource resource : card.getResourceCost()) {
            if (tempResources.contains(resource)) {
                tempResources.remove(resource);
            }else {
                return false;
            }
        }
        return true;
    }
    return false;
}