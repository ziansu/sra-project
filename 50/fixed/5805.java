@org.junit.BeforeClass
public static void setUp() {
    tests.MapLoadTests.game = new Game.Game("TestLevel.csv", null);
}