public CreditCard.CardType convertTypeToModel(java.lang.String text) {
    project.model.CreditCard.CardType type;
    if (text.equals("Visa")) {
        type = CreditCard.CardType.VISA;
    }else
        if (text.equals("MC")) {
            type = CreditCard.CardType.MC;
        }else
            if (text.equals("American Express")) {
                type = CreditCard.CardType.AMERICAN_EXPRESS;
            }else
                if (text.equals("Discover")) {
                    type = CreditCard.CardType.DISCOVER;
                }else {
                    type = CreditCard.CardType.VISA;
                }
            
        
    
    return type;
}