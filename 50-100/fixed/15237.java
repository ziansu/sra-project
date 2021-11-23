public void post(int cardIndex) {
    if (cardsAvailable.get(new java.lang.Integer(cardIndex))) {
        cardsAvailable.put(new java.lang.Integer(cardIndex), new java.lang.Boolean(false));
        service.post(cards.get(cardIndex));
        observer.notifyCardPosted(cardIndex);
    }else
        observer.notifyError("You have already posted this card!");
    
}