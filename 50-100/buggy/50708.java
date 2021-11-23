private void rankCalculation(dabin.CardPack card) {
    calPair(card);
    if ((card.rank) == (dabin.Output.HIGHCARD)) {
        calStraight(card);
    }else {
        for (int i = 0; i < (card.value.length); i++) {
            if (((card.value[i]) > 0) && (card.max.equals(i))) {
                card.max.add(i);
            }
        }
    }
}