public boolean matches(Activity01.Card otherCard) {
    if (((otherCard.suit().equals(suit)) && (otherCard.rank().equals(rank))) && ((otherCard.pointValue()) == (pointValue)))
        return true;
    else
        return false;
    
}