private org.auraframework.service.ContextService establishAuraContext() {
    if (!(contextService.isEstablished())) {
        contextService.startContext(Mode.PTEST, Format.JSON, Authentication.AUTHENTICATED);
    }
    return contextService;
}