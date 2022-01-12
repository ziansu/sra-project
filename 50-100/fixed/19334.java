public void createCards() {
    for (int i = 0; i < (policies.length); i++) {
        cards[i] = new starvationevasion.client.GUI.DraftLayout.CardNode(gui.getAssignedRegion(), policies[i]);
        cards[i].setManaged(false);
        this.getChildren().add(cards[i]);
    }
    onResize();
}