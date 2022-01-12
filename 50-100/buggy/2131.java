@java.lang.Override
public void setApplicationContext(org.springframework.context.ApplicationContext applicationContext) throws org.springframework.beans.BeansException {
    java.util.Map<java.lang.String, com.github.dataflow.sender.core.event.EventHandler> eventHandlerMap = applicationContext.getBeansOfType(com.github.dataflow.sender.core.event.EventHandler.class);
    if (org.springframework.util.CollectionUtils.isEmpty(eventHandlers)) {
        throw new com.github.dataflow.sender.core.exception.DataSenderException("there is no EventHandler bean");
    }else {
        eventHandlers.clear();
        eventHandlers.addAll(eventHandlerMap.values());
    }
}