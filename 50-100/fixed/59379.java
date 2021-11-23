public boolean equals(urgenda.util.DateTimePair d) {
    if ((d.getEarlierDateTime()) == (this.getEarlierDateTime())) {
        if ((d.getLaterDateTime()) == (this.getLaterDateTime())) {
            return true;
        }
    }
    return false;
}