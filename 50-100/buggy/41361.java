private client.PlayerStatus changeState(client.Card cardPointed) {
    if ((cardPointed.getCategory()) == (CardCategory.BASIC)) {
        switch (cardPointed.getCardID()) {
            case BASIC_APPLE :
                handCards.remove(cardPointed);
                return PlayerStatus.INIT;
            case BASIC_DODGE :
                handCards.remove(cardPointed);
                return PlayerStatus.INIT;
            case BASIC_KILL :
                return PlayerStatus.TARGETING;
        }
    }
    return PlayerStatus.INIT;
}