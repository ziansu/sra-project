public static com.gradians.prepwell.dom.Card getCurrentCard() {
    if ((com.gradians.prepwell.dom.Dealer._currentQ) == null)
        return null;
    
    return com.gradians.prepwell.dom.Dealer._currentQ.getCurrentCard();
}