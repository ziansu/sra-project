@org.junit.Test
public final void startGuiApplet() {
    de.aikiit.spamprotector.GUI gui = new de.aikiit.spamprotector.GUI(true);
    assertNotNull(gui);
}