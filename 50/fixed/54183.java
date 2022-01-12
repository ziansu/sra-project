public Card getTop() {
    if ((index) == (-1))
        return null;
    
    java.lang.System.out.println(index);
    return this.column[index];
}