@java.lang.Override
public void tick(kcl.teamIndexZero.traffic.simulator.data.SimulationTick tick) {
    CurrentDate = (new java.util.Date().getTime()) / 1000;
    if (((CurrentDate) - (lastChange)) > (timer)) {
        modelSet.changeColour(model, model.currentState);
        lastChange = CurrentDate;
    }
}