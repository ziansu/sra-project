@java.lang.Override
public org.ggp.base.util.statemachine.MachineState getInitialState() {
    propNet.getInitProposition().setValue(true);
    return getStateFromBase();
}