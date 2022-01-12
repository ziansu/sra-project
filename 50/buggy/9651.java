public int sumCards() {
    int sum = 0;
    for (com.bishopireton.finalproject.Card card : cards)
        sum += card.getRank();
    
    return sum;
}