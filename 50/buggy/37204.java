public com.badlogic.poker.core.entity.Table getTable(java.lang.String method) {
    for (com.badlogic.poker.core.entity.Card card : table.getCardsOnDesk()) {
        java.lang.System.out.println(((("method: " + method) + " ----- ") + card));
    }
    return table;
}