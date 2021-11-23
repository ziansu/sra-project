@org.junit.Test
public void testContainsAce() {
    hand.addCardToHand(card1);
    hand.addCardToHand(card3);
    junit.framework.Assert.assertEquals(1, hand.containsAce());
}