public void reset() {
    _currCard = _cards.get(0);
    for (com.gradians.prepwell.dom.Card c : _cards)
        c.reset();
    
}