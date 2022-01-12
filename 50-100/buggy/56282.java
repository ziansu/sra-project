public void process(com.topicsbot.services.api.telegram.model.Update update) {
    com.topicsbot.services.api.telegram.handlers.UpdateType updateType = convert(update);
    try {
        com.topicsbot.services.api.telegram.handlers.UpdateHandler handler = handlers.get(updateType);
        if (handler == null)
            throw new java.lang.IllegalArgumentException(("Missed handler for update type: " + updateType));
        
        handler.handle(update);
    } catch (java.lang.Exception ex) {
        com.topicsbot.services.api.telegram.handlers.UpdateProcessor.logger.error(ex.getMessage(), ex);
    }
}