@org.junit.Test
public void testPushNewCard() {
    models.Hand handTest = new models.Hand();
    models.Card cardTest = new models.Card(2, 'd', false);
    handTest.pushNewCard(1, cardTest);
    org.junit.Assert.assertEquals(handTest.getTopCardValue(1), 2);
}