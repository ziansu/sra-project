public boolean DoHit(BlackJack.model.Player a_dealer) {
    for (BlackJack.model.Card c : a_dealer.GetHand()) {
        if ((c.GetValue()) == (Card.Value.Ace)) {
            if ((a_dealer.CalcScore()) == (g_hitLimit)) {
                g_softHit = true;
            }
        }
    }
    return ((a_dealer.CalcScore()) < (g_hitLimit)) || (g_softHit);
}