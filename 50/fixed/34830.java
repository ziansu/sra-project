@org.junit.Test
public final void startGuiNoApplet() {
    de.aikiit.spamprotector.GUI gui = new de.aikiit.spamprotector.GUI(false);
    assertNotNull(gui);
}