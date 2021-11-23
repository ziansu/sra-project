public Card getTop() {
    if ((index) == (-1))
        return null;
    
    return this.column[index];
}