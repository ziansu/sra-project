@org.junit.Before
public void doBeforeTests() {
    testGame = new a4.test.MonopolyGame();
    a4.gui.IModel model = new a4.test.MockModel(testGame);
    testGame.setModel(model);
    java.util.ArrayList<java.lang.String> names = new java.util.ArrayList<java.lang.String>();
    names.add("Chancey");
    names.add("David");
    testGame.newGame(names, 30);
}