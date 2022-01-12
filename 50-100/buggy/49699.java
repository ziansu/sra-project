public java.lang.String[] getAllCardName() {
    java.util.ArrayList<wallyson.com.br.mypocket.model.Card> ca;
    ca = card.selectCard();
    java.lang.String[] arrayCard = new java.lang.String[ca.size()];
    for (wallyson.com.br.mypocket.model.Card a : ca) {
        int i = 0;
        arrayCard[i] = a.getCardName();
        i++;
    }
    return arrayCard;
}