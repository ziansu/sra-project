@java.lang.Override
public us.ihmc.robotics.stateMachines.conditionBasedStateMachine.StateTransition<us.ihmc.humanoidRobotics.communication.packets.dataobjects.HighLevelController> getOrCreateStateTransition(java.util.EnumMap<us.ihmc.humanoidRobotics.communication.packets.dataobjects.HighLevelController, ? extends us.ihmc.robotics.stateMachines.conditionBasedStateMachine.FinishableState<us.ihmc.humanoidRobotics.communication.packets.dataobjects.HighLevelController>> controllerStateMap, us.ihmc.commonWalkingControlModules.highLevelHumanoidControl.HighLevelControllerFactoryHelper controllerFactoryHelper, us.ihmc.yoVariables.registry.YoVariableRegistry parentRegistry) {
    if ((stateTransition) != null)
        return stateTransition;
    
    us.ihmc.robotics.stateMachines.conditionBasedStateMachine.StateTransitionCondition stateTransitionCondition = new us.ihmc.commonWalkingControlModules.highLevelHumanoidControl.stateTransitions.ControllerFailedTransition(stateToAttachEnum, nextStateEnum, controllerFactoryHelper.getFallbackControllerForFailure(), controllerFactoryHelper.getHighLevelHumanoidControllerToolbox(), parentRegistry);
    stateTransition = new us.ihmc.robotics.stateMachines.conditionBasedStateMachine.StateTransition(nextStateEnum, stateTransitionCondition);
    return stateTransition;
}