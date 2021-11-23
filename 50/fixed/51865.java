@java.lang.Override
public boolean isTerminal(org.ggp.base.util.statemachine.MachineState state) {
    markBases(state);
    java.lang.Boolean result = getPropMark(propNet.getTerminalProposition());
    return result;
}