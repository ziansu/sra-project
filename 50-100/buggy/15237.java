public void post(int cardIndex) {
    if (cardsAvailable.get(new java.lang.Integer(cardIndex))) {
        service.post(cards.get(cardIndex));
        observer.notifyCardPosted(cardIndex);
    }else
        observer.notifyError("You have already posted this card!");
    
}