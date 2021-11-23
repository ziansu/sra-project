@org.junit.Test
public void getDealer_inputNone_returnsDealer() {
    pokerController.setRandomDealer();
    org.junit.Assert.assertEquals(de.htwg.se.texasholdem.model.Player.class, pokerController.getDealer().getClass());
}