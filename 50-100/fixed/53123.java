public void combineWithItem(EscapeTheReadingQuiz.InventoryItem item, EscapeTheReadingQuiz.Player p) {
    if (((item.getID()) == (requiredItem.getID())) && ((item.getName()) != (this.getName()))) {
        p.useItem(item.getName());
        p.useItem(this.getName());
        p.pickUp(resultItem);
    }
}