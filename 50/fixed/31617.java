public int insertCard(Card toAdd) {
    if ((index) > 12)
        return -1;
    
    ++(index);
    column[index] = new Card(toAdd);
    return index;
}