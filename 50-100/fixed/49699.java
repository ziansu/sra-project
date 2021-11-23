public java.util.ArrayList<java.lang.String> getAllCardName() {
    java.util.ArrayList<wallyson.com.br.mypocket.model.Card> ca = card.selectCard();
    java.util.ArrayList<java.lang.String> arrayCard = new java.util.ArrayList<>();
    for (wallyson.com.br.mypocket.model.Card a : ca) {
        arrayCard.add(a.getCardName());
    }
    return arrayCard;
}