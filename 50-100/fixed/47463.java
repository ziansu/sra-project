private void removeGhostCards() {
    for (int i = (this.cards.size()) - 1; i >= 0; i--) {
        if ((this.cards.get(i)) instanceof io.github.zachohara.percussionpacker.card.GhostCard) {
            this.remove(this.cards.get(i));
        }
    }
}