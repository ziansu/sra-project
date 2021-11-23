public boolean equals(client.Card otherCard) {
    if (((this.Augenzahl) == (otherCard.getAugenzahl())) && (this.getType().equals(otherCard.getType().toString()))) {
        return true;
    }else
        return false;
    
}