private int has4Kind() {
    java.util.ArrayList<edu.psu.ist412.poker.Card> sorted = sortByValue(getCombined());
    java.util.ArrayList<edu.psu.ist412.poker.CardValue> cardValues = edu.psu.ist412.poker.CardValue.getAll();
    int numValue = 0;
    for (int i = 0; i < (cardValues.size()); i++) {
        numValue = countValue(sorted, cardValues.get(i));
        if (numValue == 4) {
            return cardValues.get(i).getRank();
        }
    }
    return 0;
}