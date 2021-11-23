public kronos.fsm.StateMachine<kronos.fsm.PartStates, kronos.fsm.Triggers> newStateMachine() {
    kronos.fsm.StateMachine<kronos.fsm.PartStates, kronos.fsm.Triggers> stateMachine = new kronos.fsm.StateMachine(PartStates.INIT, fsmc);
    return stateMachine;
}