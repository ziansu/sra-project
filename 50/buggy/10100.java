private void initialize() {
    us.ihmc.tools.io.printing.PrintTools.debug(us.ihmc.humanoidBehaviors.dispatcher.BehaviorDispatcher.DEBUG, this, ("Initializing " + (stateMachine.getCurrentStateEnum().name())));
    stateMachine.initialize();
}