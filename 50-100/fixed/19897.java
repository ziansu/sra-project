public java.util.LinkedList<integratedtoolkit.scheduler.types.AllocatableAction<P, T>> getHostedActions(integratedtoolkit.types.resources.Worker<T> worker) {
    integratedtoolkit.util.ResourceScheduler<P, T> ui = workers.get(worker);
    java.util.LinkedList<integratedtoolkit.scheduler.types.AllocatableAction<P, T>> hostedActions;
    if (ui != null) {
        hostedActions = ui.getHostedActions();
    }else {
        hostedActions = new java.util.LinkedList<integratedtoolkit.scheduler.types.AllocatableAction<P, T>>();
    }
    return hostedActions;
}