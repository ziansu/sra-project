public void setup() {
    java.lang.System.out.println("Running setup");
    rgSpace = null;
    agentList = new java.util.ArrayList();
    schedule = new uchicago.src.sim.engine.Schedule(1);
    if ((displaySurf) != null) {
        displaySurf.dispose();
    }
    displaySurf = null;
    displaySurf = new uchicago.src.sim.gui.DisplaySurface(this, "Rabbit Grass Model Window 1");
    registerDisplaySurface("Rabbit Grass Model Window 1", displaySurf);
}