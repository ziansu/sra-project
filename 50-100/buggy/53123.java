public void combineWithItem(EscapeTheReadingQuiz.InventoryItem item, EscapeTheReadingQuiz.Player p) {
    if ((item.getID()) == (requiredItem.getID())) {
        p.useItem(item.getName());
        p.useItem(this.getName());
        p.pickUp(resultItem);
    }
}