public com.sdl.webapp.common.api.model.EntityModel getEntity() {
    if ((this.entity) == null) {
        com.sdl.webapp.common.api.content.ContentProvider contentProvider = com.sdl.webapp.common.util.ApplicationContextHolder.getContext().getBean(com.sdl.webapp.common.api.content.ContentProvider.class);
        try {
            this.entity = contentProvider.getEntityModel(entityId, localization);
        } catch (com.sdl.webapp.common.api.content.ContentProviderException | com.sdl.webapp.common.exceptions.DxaException e) {
            log.warn("EntityModel not found for entity id {}", entityId, e);
        }
    }
    return entity;
}