public eu.trentorise.game.model.core.Notification toNotification() {
    com.fasterxml.jackson.databind.ObjectMapper mapper = new com.fasterxml.jackson.databind.ObjectMapper();
    try {
        return mapper.convertValue(getObj(), ((java.lang.Class<? extends eu.trentorise.game.model.core.Notification>) (java.lang.Thread.currentThread().getContextClassLoader().loadClass(getType()))));
    } catch (java.lang.Exception e) {
        logger.error("Problem to load class {}", getType());
        return null;
    }
}