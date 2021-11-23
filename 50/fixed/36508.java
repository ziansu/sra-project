@org.junit.Test
public void getDealer_inputNone_returnsDealer() {
    pokerController.setRandomDealer(0);
    org.junit.Assert.assertEquals(de.htwg.se.texasholdem.model.Player.class, pokerController.getDealer().getClass());
}