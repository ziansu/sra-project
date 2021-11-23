@java.lang.Override
public void onEnded(addons.eventhandlers.EndEvent event) {
    printStream.println(("Ended Simulation " + ((simulationCount) + 1)));
    (simulationCount)++;
}