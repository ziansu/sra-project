private client.PlayerStatus changeState(client.Card cardPointed) {
    if ((cardPointed.getCategory()) == (CardCategory.BASIC)) {
        switch (cardPointed.getCardID()) {
            case BASIC_APPLE :
                return PlayerStatus.INIT;
            case BASIC_DODGE :
                return PlayerStatus.INIT;
            case BASIC_KILL :
                return PlayerStatus.TARGETING;
        }
    }
    return PlayerStatus.INIT;
}