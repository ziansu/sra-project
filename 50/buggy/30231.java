private void loadCards(java.util.ArrayList<java.lang.String> cards) {
    try {
        CardList = cards;
        java.util.Collections.sort(CardList);
        loadPlayerPanel();
    } catch (java.lang.Exception ex) {
        java.lang.System.out.println(ex);
    }
}