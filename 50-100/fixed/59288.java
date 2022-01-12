public java.util.Map<java.lang.String, Model.Card> getAllCard() {
    java.util.Map<java.lang.String, Model.Card> output = new java.util.HashMap<>();
    for (Model.Card eCard : energyCards)
        output.put(eCard.getId(), eCard);
    
    if ((stageOneCard) != null)
        output.put(getStageOneCard().getId(), getStageOneCard());
    
    if ((basicCard) != null)
        output.put(getBasicCard().getId(), getBasicCard());
    
    return output;
}