public boolean hasCard(java.lang.String card) {
    return (this.stacks.containsKey(card)) && ((this.stacks.get(card)) > 1);
}