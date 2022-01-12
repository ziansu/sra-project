@org.junit.Test
public void fourOfAKindTest2() {
    int[] cards = new int[]{ 12 , 25 , 38 , 51 , 1 , 7 , 29 };
    for (int i = 0; i < (cards.length); i++)
        deck.getCard(cards[i]).displayCard();
    
    int ans = Table.handValue(cards);
    org.junit.Assert.assertEquals(8, ans);
}