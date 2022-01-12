public boolean equals(client.Card otherCard) {
    if (((this.Augenzahl) == (otherCard.getAugenzahl())) && (this.getType().equals(otherCard.getType()))) {
        return true;
    }else {
        return false;
    }
}