@org.junit.Before
public void _setup() {
    pokerController = new de.htwg.se.texasholdem.controller.imp.PokerControllerImp();
    p1 = new de.htwg.se.texasholdem.model.Player("Player One");
    p2 = new de.htwg.se.texasholdem.model.Player("Player Two");
    p3 = new de.htwg.se.texasholdem.model.Player("Player Three");
    pokerController.addPlayer("Player One");
    pokerController.addPlayer("Player Two");
    pokerController.addPlayer("Player Three");
    pokerController.setPlayerActive(p1);
    pokerController.setPlayerActive(p2);
    pokerController.setPlayerActive(p3);
    pokerController.startGame(0);
}