public void loadProgram(java.lang.String file, java.util.Hashtable breakpoints) {
    if (be.ac.kuleuven.cs.drama.simulator.simple.SimpleMachine.DEBUG)
        java.lang.System.out.println("SimpleMachine.loadProgram()");
    
    systemMessage("Programma wordt geladen...");
    reset();
    _halted = false;
    try {
        ram().loadProgram(file);
        _cpu.setBreakPoints(breakpoints);
    } catch (be.ac.kuleuven.cs.drama.simulator.simple.FatalMachineError fme) {
        systemMessage("Fout bij het laden van het programma.");
    }
}