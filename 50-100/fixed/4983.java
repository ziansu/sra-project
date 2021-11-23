@java.lang.Override
public void post(java.lang.Object event) {
    if (event instanceof plugin.events.AsyncPluginEvent) {
        context.getService().execute(() -> super.post(event));
        return ;
    }
    if (event instanceof plugin.events.GamePluginEvent) {
        plugin.events.GamePluginEvent evt = ((plugin.events.GamePluginEvent) (event));
        if ((evt.context()) == null) {
            evt.context_$eq(context);
        }
        super.post(evt);
        return ;
    }
    super.post(event);
}