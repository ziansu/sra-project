@org.junit.Test
public void getCurrentCallValue_input_returns() {
    int smallBlind = 30;
    int credits = 100;
    pokerController.setDealer(pokerController.getPlayerList().get(0));
    pokerController.setStartCredits(credits);
    pokerController.setBlinds(smallBlind);
    pokerController.startGame();
    org.junit.Assert.assertEquals(pokerController.getPlayerList().get(0), pokerController.getCurrentPlayer());
    int callValue = pokerController.getCurrentCallValue();
    org.junit.Assert.assertEquals((smallBlind * 2), callValue);
}