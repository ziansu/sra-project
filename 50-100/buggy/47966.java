public static int cardPointValue(ps4n7CardGames.Card card) {
    if ((card.getRANK_VALUE()) > 7) {
        return 10;
    }else
        if ((card.getRANK_VALUE()) == 12) {
            return 11;
        }
    
    return (card.getRANK_VALUE()) + 2;
}