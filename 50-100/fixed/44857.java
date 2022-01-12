public void removeCard(at.fancycardgame.aauno.UnoCard cardToRemove) {
    for (at.fancycardgame.aauno.UnoCard c : this.cards) {
        if (c.getName().equals(cardToRemove.getName())) {
            android.util.Log.d("Removed Card:", c.getName());
            this.cards.remove(c);
            break;
        }
    }
}