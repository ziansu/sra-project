@java.lang.Override
public us.ihmc.robotics.stateMachines.conditionBasedStateMachine.StateTransition<E> getOrCreateStateTransition(java.util.EnumMap<E, ? extends us.ihmc.robotics.stateMachines.conditionBasedStateMachine.FinishableState<E>> stateMap, us.ihmc.commonWalkingControlModules.highLevelHumanoidControl.HighLevelControllerFactoryHelper controllerFactoryHelper, us.ihmc.yoVariables.registry.YoVariableRegistry parentRegistry) {
    if ((stateTransition) == null)
        stateTransition = us.ihmc.robotics.stateMachines.conditionBasedStateMachine.StateMachineTools.buildRequestableStateTransition(requestedControlState, nextStateEnum);
    
    return stateTransition;
}