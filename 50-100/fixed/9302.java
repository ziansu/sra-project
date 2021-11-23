@org.junit.Test
public void testDrawFaceUpTrainCards() throws java.lang.Exception {
    tickets.scacciot17.tickettooride.ttr.TTRState myState = new tickets.scacciot17.tickettooride.ttr.TTRState();
    tickets.scacciot17.tickettooride.ttr.FaceUpDeck faceUpDeck = myState.getFiveUp();
    int size = faceUpDeck.size();
    for (int i = 0; i < size; i++) {
        assertNotEquals(faceUpDeck.getCards().get(i), null);
    }
}