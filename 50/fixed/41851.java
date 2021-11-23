@org.junit.Test
public final void mainMethodScreenTest() {
    release1.Main test = new release1.Main();
    test.getClass();
    release1.MainScreen testScreen = new release1.MainScreen();
    org.junit.Assert.assertTrue(release1.MainScreen.class.equals(testScreen.getClass()));
}