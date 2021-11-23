public void runProgram(int startPc) {
    java.lang.System.out.println(("Starting programm at pc " + startPc));
    controlUnit.startMachine();
    while ((getState()) == (ControlUnit.MachineState.RUNNING)) {
        step();
    } 
}