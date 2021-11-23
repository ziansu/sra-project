public void createCards() {
    for (int i = 0; i < (starvationevasion.common.Constant.MAX_HAND_SIZE); i++) {
        cards[i] = new starvationevasion.client.GUI.DraftLayout.CardNode(gui.getAssignedRegion(), policies[i]);
        cards[i].setManaged(false);
        this.getChildren().add(cards[i]);
    }
    onResize();
}