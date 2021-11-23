public boolean equals(client.Card otherCard) {
    if (otherCard != null) {
        if (((this.Augenzahl) == (otherCard.getAugenzahl())) && (this.getType().equals(otherCard.getType()))) {
            return true;
        }else {
            return false;
        }
    }else {
        return false;
    }
}