@org.junit.Before
public void setUp() throws java.lang.Exception {
    injector = com.google.inject.Guice.createInjector(new de.htwg.monopoly.TestMonopolyModule());
    testController = injector.getInstance(de.htwg.monopoly.controller.IController.class);
    java.util.List<java.lang.String> playerList = new java.util.ArrayList<java.lang.String>();
    playerList.add("0");
    playerList.add("1");
    java.lang.System.out.println(playerList);
    testController.startNewGame(playerList);
}