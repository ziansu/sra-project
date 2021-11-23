public boolean equals(urgenda.util.DateTimePair d) {
    if (((d.getEarlierDateTime()) == (this.getEarlierDateTime())) && ((d.getLaterDateTime()) == (this.getLaterDateTime()))) {
        return true;
    }
    return false;
}