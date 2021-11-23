@org.junit.Test
public void testPopTopCard() {
    models.Hand handTest = new models.Hand();
    models.Card cardTest = new models.Card(2, 'd', false);
    if ((cardTest != null) && (handTest != null))
        handTest.pushNewCard(1, cardTest);
    
    handTest.popTopCard(1);
    org.junit.Assert.assertEquals(handTest.getTopCardValue(1), 0);
}