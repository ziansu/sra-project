public boolean matches(Activity01.Card otherCard) {
    return ((otherCard.suit().equals(this.suit())) && (otherCard.rank().equals(this.rank()))) && ((otherCard.pointValue()) == (this.pointValue()));
}