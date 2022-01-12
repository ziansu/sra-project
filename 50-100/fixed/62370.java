public void init(sim.display.Controller c) {
    super.init(c);
    display = new sim.display.Display2D(800, 600, this);
    display.setBackdrop(java.awt.Color.black);
    displayFrame = display.createFrame();
    displayFrame.setTitle("Exploration Demo");
    c.registerFrame(displayFrame);
    displayFrame.setVisible(true);
    display.attach(knownWorld, "Known world objects");
}