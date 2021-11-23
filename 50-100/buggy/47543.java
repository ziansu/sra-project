public java.util.ArrayList<Card> checkHand() {
    java.util.ArrayList<Card> result;
    for (Card c : mCards) {
        result = checkList(c);
        if (result == null)
            return null;
        else
            if ((result.size()) == 3)
                return result;
            else
                return null;
            
        
    }
    return null;
}