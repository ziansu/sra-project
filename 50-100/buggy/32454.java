public CreditCard.CardType convertTypeToModel(java.lang.String text) {
    project.model.CreditCard.CardType type;
    if (typeText.equals("Visa")) {
        type = CreditCard.CardType.VISA;
    }else
        if (typeText.equals("MC")) {
            type = CreditCard.CardType.MC;
        }else
            if (typeText.equals("American Express")) {
                type = CreditCard.CardType.AMERICAN_EXPRESS;
            }else
                if (typeText.equals("Discover")) {
                    type = CreditCard.CardType.DISCOVER;
                }else {
                    type = CreditCard.CardType.VISA;
                }
            
        
    
    return type;
}