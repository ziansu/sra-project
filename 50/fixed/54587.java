public java.util.ArrayList<java.lang.String> runSim() {
    io.github.krindor.ffxivsimulator.Ninja.SimulatorCore.iterations = 10002;
    io.github.krindor.ffxivsimulator.RunSimThreaded simThreaded = new io.github.krindor.ffxivsimulator.RunSimThreaded("Ninja");
    return simThreaded.runSim();
}