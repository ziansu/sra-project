public static heavyinternetindustries.mephesto.cards.Card isPair(heavyinternetindustries.mephesto.cards.Card... params) {
    heavyinternetindustries.mephesto.cards.Card ret = null;
    for (heavyinternetindustries.mephesto.cards.Card card : params)
        card.setAceHigh();
    
    for (heavyinternetindustries.mephesto.cards.Card i : params) {
        for (heavyinternetindustries.mephesto.cards.Card j : params) {
            if ((heavyinternetindustries.mephesto.cards.Card.isPair(i, j)) && (i != j)) {
                if (ret == null)
                    ret = i;
                
                if ((i.compareTo(ret)) > 0)
                    ret = i;
                
            }
        }
    }
    return ret;
}