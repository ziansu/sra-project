@java.lang.Override
public void configure(rea.toyrobot.executor.GlobalInitiator instance) throws rea.toyrobot.exceptions.RobotInitialisationException {
    instance.setWorld(world);
    globalActionsInitialiser = new rea.toyrobot.config.initialisers.mapper.global.GlobalActionsInitialiser(world);
    for (rea.toyrobot.config.mapper.jabx.ToyRobot.ReaGlobalInitiator.Action action : config.getReaGlobalInitiator().getAction()) {
        rea.toyrobot.actions.physicalobjects.GlobalAction globalAction = globalActionsInitialiser.map(action.getClazz());
        globalAction.setWorld(world);
        instance.addAction(globalAction);
    }
}