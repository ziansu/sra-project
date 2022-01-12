public Card peek_foundation_card(final int foundation_num) {
    if (foundations.get(foundation_num).isEmpty())
        return null;
    
    return foundations.get(foundation_num).peek();
}