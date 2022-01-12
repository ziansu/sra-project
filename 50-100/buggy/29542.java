@java.lang.Override
public void saveActiveContext() {
    org.eclipse.mylyn.internal.context.core.ContextCorePlugin.getContextStore().saveActiveContext();
    org.eclipse.mylyn.tasks.core.ITask task = org.eclipse.mylyn.tasks.ui.TasksUi.getTaskActivityManager().getActiveTask();
    stateHandler.saved(task);
    final org.eclipse.mylyn.internal.context.tasks.ui.TaskContextStoreEvent event = new org.eclipse.mylyn.internal.context.tasks.ui.TaskContextStoreEvent(org.eclipse.mylyn.internal.context.tasks.ui.TaskContextStoreEvent.Kind.SAVE, task);
    listeners.notify(new org.eclipse.mylyn.commons.core.CommonListenerList.Notifier<org.eclipse.mylyn.internal.context.tasks.ui.TaskContextStoreListener>() {
        @java.lang.Override
        public void run(org.eclipse.mylyn.internal.context.tasks.ui.TaskContextStoreListener listener) throws java.lang.Exception {
            listener.taskContextChanged(event);
        }
    });
}