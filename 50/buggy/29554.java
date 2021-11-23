public int getValueRank() {
    int rank = 0;
    for (java.lang.Integer i : getItemValues().keySet()) {
        if (i == (getValue()))
            return rank;
        
        rank++;
    }
    return 0;
}