public void addContextListenerOnce(net.jplugin.core.kernel.api.ctx.ThreadLocalContextListener ruleContextListener) {
    if (((listeners) == null) || (listeners.contains(ruleContextListener)))
        return ;
    else
        addContextListener(ruleContextListener);
    
}