@java.lang.Override
protected void handleLifecycleMessage(co.paralleluniverse.actors.LifecycleMessage m) {
    if (m instanceof co.paralleluniverse.actors.ExitMessage) {
        final co.paralleluniverse.actors.ExitMessage exit = ((co.paralleluniverse.actors.ExitMessage) (m));
        if ((java.util.Objects.equals(exit.getActor(), actor)) && ((exit.getWatch()) == null))
            throw co.paralleluniverse.common.util.Exceptions.rethrow(exit.getCause());
        
    }
    super.handleLifecycleMessage(m);
}