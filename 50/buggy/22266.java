public void PostEvent(com.kmagic.solitaire.SolitaireView view, int event, com.kmagic.solitaire.CardAnchor anchor) {
    mEvent = event;
    mCardAnchor = anchor;
    mCard = null;
    view.post(this);
}