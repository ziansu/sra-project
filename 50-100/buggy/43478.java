@java.lang.Override
public void handleLightColors(double timePassed, simulator.phases.PhaseHandler phase) {
    timeUntilColorChange -= timePassed;
    if ((timeUntilColorChange) < 0) {
        if ((this.currentColor) == (Color.GREEN)) {
            setTimeUntilColorChange();
            simulator.outputter.Outputter.getOutputter().addLightOutput(this);
        }else {
            setTimeUntilColorChange();
            simulator.outputter.Outputter.getOutputter().addLightOutput(this);
        }
    }
}